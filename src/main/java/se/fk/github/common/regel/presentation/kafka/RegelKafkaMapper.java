package se.fk.github.common.regel.presentation.kafka;

import jakarta.enterprise.context.ApplicationScoped;
import se.fk.github.common.regel.logic.dto.CreateRegelDataRequest;
import se.fk.rimfrost.regel.common.RegelRequestMessagePayload;
import se.fk.github.common.regel.logic.dto.ImmutableCreateRegelDataRequest;

import java.util.UUID;

@ApplicationScoped
public class RegelKafkaMapper
{
   public CreateRegelDataRequest toCreateRegelDataRequest(RegelRequestMessagePayload rtfRequest)
   {
      return ImmutableCreateRegelDataRequest.builder()
            .id(UUID.fromString(rtfRequest.getId()))
            .kogitorootprociid(UUID.fromString(rtfRequest.getKogitorootprociid()))
            .kogitorootprocid(rtfRequest.getKogitorootprocid())
            .kogitoparentprociid(UUID.fromString(rtfRequest.getKogitoparentprociid()))
            .kogitoprocid(rtfRequest.getKogitoprocid())
            .kogitoprocinstanceid(UUID.fromString(rtfRequest.getKogitoprocinstanceid()))
            .kogitoprocist(rtfRequest.getKogitoprocist())
            .kogitoprocversion(rtfRequest.getKogitoprocversion())
            .kundbehovsflodeId(UUID.fromString(rtfRequest.getData().getKundbehovsflodeId()))
            .build();
   }

   /*   public UpdateRegelDataRequest toUpdateRtfDataRequest(OperativtUppgiftslagerResponseMessage oulResponse)
   {
      return ImmutableUpdateRtfDataRequest.builder()
            .kundbehovsflodeId(UUID.fromString(oulResponse.getKundbehovsflodeId()))
            .uppgiftId(UUID.fromString(oulResponse.getUppgiftId()))
            .build();
   }*/

}
