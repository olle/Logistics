package logistics;

/**
 * A port or harbor - an important junction in trans-shipment logistics.
 *
 * <p>In our domain, since we're generally concerned with multi-modal transportation on route <em>to</em> a
 * {@link Seaport}, it is the destination or staring point of a transportation order.</p>
 *
 * <p>In german {@link Seehafen}.</p>
 *
 * @author  Olle Törnström
 */
public interface Seaport {
}

/**
 * An einem Seehafen werden Container auf ein Seeschiff zum Transport auf den Seeweg verladen oder von einem Seeschiff
 * entladen.
 */
interface Seehafen {
}
