// @formatter:off
// This class is generated, do not edit!
package io.obswebsocket.community.client.message.event.config;

import io.obswebsocket.community.client.message.event.Event;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;

/**
 * The current scene collection has changed.
 *
 * Note: If polling has been paused during `CurrentSceneCollectionChanging`, this is the que to restart polling.
 */
@Getter
@ToString(
    callSuper = true
)
public class CurrentSceneCollectionChangedEvent extends Event<CurrentSceneCollectionChangedEvent.SpecificData> {
  protected CurrentSceneCollectionChangedEvent() {
    super(Intent.Config);
  }

  protected CurrentSceneCollectionChangedEvent(
      CurrentSceneCollectionChangedEvent.SpecificData data) {
    super(Intent.Config, data);
  }

  @Getter
  @ToString
  @Builder
  public static class SpecificData {
    /**
     * Name of the new scene collection
     */
    @NonNull
    private String sceneCollectionName;
  }
}
