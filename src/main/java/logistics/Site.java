package logistics;

/**
 * Describing a property of a physical company location - or its <i>modality</i>, with regards to the logistic
 * capability it provides.
 *
 * <p>Site information generally describes either a {@link Terminal terminal}, {@link Seaport seaport} or a
 * {@link LoadingPlace loading place}, not because of its {@link Location location}, but because of it's function in a
 * given context - for example in a business event.</p>
 *
 * <p>In german {@link Standortart}.</p>
 *
 * @author  Olle Törnström
 * @see  Terminal
 * @see  Seaport
 * @see  LoadingPlace
 * @see  Location
 */
public interface Site {
}

interface Standortart {
}
