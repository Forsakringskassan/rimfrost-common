package se.fk.github.common.regel.logic.dto;

import org.immutables.value.Value;

import java.util.UUID;

@Value.Immutable
public interface CreateRegelDataRequest
{
   UUID id();

   UUID kundbehovsflodeId();

   String kogitorootprocid();

   UUID kogitorootprociid();

   UUID kogitoparentprociid();

   String kogitoprocid();

   UUID kogitoprocinstanceid();

   String kogitoprocist();

   String kogitoprocversion();

}
