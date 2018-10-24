package logistics;

/**
 * A lorry or other type of heavy goods vehicle (HGV).
 *
 * <p>These vehicles carry out transportation tasks along the existing road-network. They are often required to begin
 * or complete a transportation order, due to their door-to-door capability (or loading bay to loading bay). Most
 * commonly a {@link Truck truck} is part of a {@link Fleet fleet}.</p>
 *
 * <p>In german {@link LKW}.</p>
 *
 * @author  Olle Törnström
 * @see  TractorUnit
 * @see  Fleet
 * @see  Zugmaschine
 */
public interface Truck {
}

/**
 * Der {@link LKW} bedient als flexibler, schneller Partner die Fläche im Nahverkehr. Dabei wird er vor allem für die
 * "erste" bzw. "letzte Meile" bei einem Transport verwendet.
 */
interface LKW {
}

/**
 * A heavy-duty towing engine, used to pull or tow semi-trailers - the engine part of a {@link Truck}.
 *
 * <p>In german {@link Zugmaschine}</p>
 *
 * @author  Olle Törnström
 */
interface TractorUnit {
}

/**
 * Nutzkraftwagen, der ausschließlich oder überwiegend zum Mitführen von Anhängerfahrzeugen bestimmt ist. (@see DIN
 * 70010:2001-04, 1.2.2.3)
 *
 * @author  Isabell Dürlich
 * @version  2018-04
 */
interface Zugmaschine {
}
