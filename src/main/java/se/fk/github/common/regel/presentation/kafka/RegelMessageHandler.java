package se.fk.github.common.regel.presentation.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import se.fk.github.logging.callerinfo.model.MDCKeys;
import se.fk.rimfrost.regel.common.RegelRequestMessagePayload;

@ApplicationScoped
public class RegelMessageHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(RegelMessageHandler.class);

    //@Inject
    //RtfService rtfService;

    @Inject
    RegelKafkaMapper mapper;

    /**
     * Handle a received RtfManuellRequestMessagePayload
     */
    public void handle(RegelRequestMessagePayload payload) {
        try {
            // Put process ID in MDC for logging
            MDC.put(MDCKeys.PROCESSID.name(), payload.getData().getKundbehovsflodeId());

            LOGGER.info(
                    "RtfManuellRequestMessagePayload received with KundbehovsflodeId: {}",
                    payload.getData().getKundbehovsflodeId()
            );

            // Map to service request and delegate
            var request = mapper.toCreateRegelDataRequest(payload);
            //rtfService.createRtfData(request);

        } finally {
            // Always clear MDC to avoid leaking to other threads
            MDC.clear();
        }
    }
}

