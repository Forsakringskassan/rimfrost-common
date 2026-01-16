package se.fk.github.common.regel.presentation.kafka;

import se.fk.github.common.regel.logic.dto.CreateRegelDataRequest;

public interface RegelRequestHandlerInterface
{

   void createRegel(CreateRegelDataRequest request);
}
