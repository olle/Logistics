package logistics;

/**
 * A station, or junction, along a transport route - typically along the inland (<em>hinterland</em>) waterways, rivers
 * or canals. Each {@link Terminal terminal} is among other things specified by it's {@link Site site} and
 * {@link Location location}.
 *
 * <p>A terminal is in our domain very often an acting business unit and a subsidiary of the logistics company. This
 * typically means that the terminal, as a organizational unit, has an identity and is referred to, not only as a
 * geographical location, but also as an <em>actor</em> with some <em>role</em> in the system. For example, business
 * events and messages typically stems from one of many terminals and roles or groups are also often bound to a
 * specific terminal.</p>
 *
 * <p>In german {@link Hinterlandterminal}, but also simply {@link Terminal}.</p>
 *
 * <p>Further information: <a href="http://www.contargo.net/de/terminals/">Contargo terminals</a></p>
 *
 * @author  Olle Törnström
 */
public interface Terminal {
}

/**
 * Ein Hinterlandterminal wird auch nur Terminal genannt. An einem Terminal werden Container zwischen Transportmitteln
 * umgeschlagen, d.h. zum Beispiel gelangt ein Container von einem Schiff auf einen LKW.
 *
 * <p>Weiterführende Information: <a href="http://www.contargo.net/de/terminals/">Terminals der Contargo</a></p>
 */
interface Hinterlandterminal {
}
