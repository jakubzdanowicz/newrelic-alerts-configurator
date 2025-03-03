package com.ocadotechnology.newrelic.alertsconfigurator.configuration.condition.signal;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

/**
 * NRQL Signal configuration.
 * Configuration parameters:
 * <ul>
 *     <li>{@link #aggregationWindow}</li>
 *     <li>{@link #evaluationWindows}</li>
 *     <li>{@link #signalFillOption}</li>
 *     <li>{@link #signalFillValue}</li>
 *     <li>{@link #signalLostConfiguration}</li>
 * </ul>
 */
@Builder
@Getter
public class NrqlSignalConfiguration {

    /**
     * Time (in seconds) for how long NewRelic collects data before running the NRQL query.
     */
    @NonNull
    private Integer aggregationWindow;

    /**
     * Number of windows to evaluate data.
     */
    @NonNull
    private Integer evaluationWindows;

    /**
     * Configuration of filling data gaps/signal lost.
     */
    @NonNull
    private SignalFillOption signalFillOption;

    /**
     * Value for filling data gaps/signal lost
     */
    private String signalFillValue;

    /**
     * Configuration of signal lost behaviour.
     */
    private SignalLostConfiguration signalLostConfiguration;

}
