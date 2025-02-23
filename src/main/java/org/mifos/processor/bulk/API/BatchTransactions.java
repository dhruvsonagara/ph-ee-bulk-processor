package org.mifos.processor.bulk.API;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

import static org.mifos.processor.bulk.zeebe.ZeebeVariables.*;

public interface BatchTransactions {

    @PostMapping(value = "/batchtransactions", produces="application/json")
    String batchTransactions(@RequestHeader(value = "X-CorrelationID") String requestId,
                        @RequestParam("data") MultipartFile file,
                        @RequestHeader(value = FILE_NAME) String fileName,
                        @RequestHeader(value = PURPOSE) String purpose,
                        @RequestHeader(value = "Type") String type,
                        @RequestHeader(value = "Platform-TenantId") String tenant) throws IOException;
}
