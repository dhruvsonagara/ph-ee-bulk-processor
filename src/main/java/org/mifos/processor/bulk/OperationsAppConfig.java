package org.mifos.processor.bulk;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class OperationsAppConfig {

    @Value("${operations-app.contactpoint}")
    public String operationAppContactPoint;

    @Value("${operations-app.endpoints.batch-transaction}")
    public String batchTransactionEndpoint;

    @Value("${operations-app.endpoints.batch-summary}")
    public String batchSummaryEndpoint;

    @Value("${operations-app.endpoints.auth}")
    public String authEndpoint;

    @Value("${operations-app.username}")
    public String username;

    @Value("${operations-app.password}")
    public String password;

    public String batchTransactionUrl;

    public String batchSummaryUrl;

    public String authUrl;

    @PostConstruct
    private void setup() {
        batchTransactionUrl = operationAppContactPoint + batchTransactionEndpoint;
        batchSummaryUrl = operationAppContactPoint + batchSummaryEndpoint;
        authUrl = operationAppContactPoint + authEndpoint;
    }
}
