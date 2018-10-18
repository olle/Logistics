package logistics;

/**
 * A place where goods are loaded onto, or unloaded from, some mode of transportation.
 *
 * <p>This is most often an external {@link Site} and {@link Location}, such as that of a customer or partner, where
 * goods are fetched from or brought to, either at the end or beginning of a transportation order. The time spent (how
 * much and doing what) is the typical information of interest with regards to a {@link LoadingPlace}.</p>
 *
 * <p>In german {@link Ladestelle}.</p>
 *
 * @author  Olle Törnström
 */
public interface LoadingPlace {
}

/**
 * An einer Ladestelle werden Container mit Gütern befüllt.
 */
interface Ladestelle {
}
