package logistics;

/**
 * Trailer (also semi-trailer) is a vehicle which has no front axle so a substantial part of its total weight is
 * transferred to a tractor unit.
 *
 * <p>Also in german just {@code Trailer} or {@link Sattelauflieger}</p>
 *
 * @author  Isabell Dürlich
 */
public interface Trailer {
}

/**
 * Anhängerfahrzeug, bei dem anstelle der bei Gelenk-Deichselanhägern vorhandenen ersten Achse eine Sattelvorrichtung
 * angeordnet ist und ein wesentlicher Teil seines Gesamtgewichts auf eine Sattelzugmaschine übertragen wird. (@see DIN
 * 70010:2001, 2.3 — modifiziert, „(siehe 1.2.2.3.2) (auch Deichselachse (Dolly))“ gestrichen, Anmerkung 1 hinzugefügt)
 *
 * @author  Isabell Dürlich
 */
interface Sattelauflieger {
}
