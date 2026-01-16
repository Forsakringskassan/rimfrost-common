package se.fk.github.common.regel.presentation.kafka;

import se.fk.github.common.regel.logic.dto.CreateRegelDataRequest;

public interface RegelRequestProcessor
{

   void process(CreateRegelDataRequest request);
}
