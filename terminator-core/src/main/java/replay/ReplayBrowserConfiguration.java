package replay;

import config.ApplicationConfiguration;
import execution.application.DefaultApplicationActionFactory;
import execution.executor.WebDriverActionExecutor;
import execution.webdriver.WebdriverActionFactory;
import utils.ConfigurationUtils;

import java.io.IOException;

/**
 * Created by hvrigazov on 19.03.17.
 */
public class ReplayBrowserConfiguration {
    private ReplayBrowser replayBrowser;

    public static Builder builder() {
        return new ReplayBrowserConfiguration.Builder();
    }

    public ReplayBrowserConfiguration(Builder builder) throws IOException {
        ApplicationConfiguration applicationConfiguration = ConfigurationUtils.parseApplicationConfiguration(builder.pathToApplicationConfiguration);
        WebDriverActionExecutor webDriverActionExecutor = builder.webDriverActionExecutor;
        WebdriverActionFactory webdriverActionFactory = builder.webdriverActionFactory;
        DefaultApplicationActionFactory applicationActionFactory = new DefaultApplicationActionFactory(builder.url, applicationConfiguration, webdriverActionFactory);
        replayBrowser = new ReplayBrowser(webDriverActionExecutor, applicationActionFactory);
    }

    public ReplayBrowser getReplayBrowser() {
        return replayBrowser;
    }

    public static class Builder {
        private String pathToApplicationConfiguration;
        private WebDriverActionExecutor webDriverActionExecutor;
        private WebdriverActionFactory webdriverActionFactory;
        private String url;

        public Builder pathToApplicationConfiguration(String pathToApplicationConfiguration) {
            this.pathToApplicationConfiguration = pathToApplicationConfiguration;
            return this;
        }

        public Builder executor(WebDriverActionExecutor executor) {
            this.webDriverActionExecutor = executor;
            return this;
        }

        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public Builder webdriverActionFactory(WebdriverActionFactory webdriverActionFactory) {
            this.webdriverActionFactory = webdriverActionFactory;
            return this;
        }

        public ReplayBrowserConfiguration build() throws IOException {
            return new ReplayBrowserConfiguration(this);
        }
    }

}
