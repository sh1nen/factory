package pl.com.bottega.factory.demand.forecasting;

import lombok.Value;

@Value
public class DemandValue {
    Demand documented;
    Adjustment adjustment;
}
