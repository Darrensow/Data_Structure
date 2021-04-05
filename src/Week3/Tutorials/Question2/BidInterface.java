package Week3.Tutorials.Question2;

public interface BidInterface<T> {

    /**
     * Gets the name of the company making this bid.
     * @return String representation of the company name making this bid
     */
    public String getCompanyName();

    /**
     * Gets the description of the air conditioner that this bid is for.
     * @return String representation of the description of the air conditioner
     */
    public String getDescription();

    /**
     * Gets the capacity of this bid's AC in tons (1 ton = 12,000 BTU).
     * @return Double value of the capacity of bid's AC in tons
     */
    public double getCapacity();

    /**
     * Gets the seasonal efficiency of this bid's AC (SEER - Seasonal energy efficiency ratio).
     * @return Double value of the seasonal efficiency of the bid's AC
     */
    public double getSeasonalEfficiency();

    /**
     * Gets the cost of this bid's AC.
     * @return Cost of the bid's AC
     */
    public double getCost();

    /**
     * Gets the installation cost of the bid's AC
     * @return cost of installing this bid's AC.
     */
    public double getInstallationCost();

    /**
     * Gets the yearly cost of operating this bid's AC
     * @return Yearly cost of operating this bid's AC
     */
    public double getYearlyOperatingCost();
}
