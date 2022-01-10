/*
 * Weapon class for Tokarev, damage 10
 */

public class Armoury
{
    // The stock manager.
    private WeaponList guns;

    public Armoury(WeaponList guns)
    {
        this.guns = guns;
        
        guns.add(new Weapon(1, "GTA San Andreas"));
        guns.add(new Weapon(2, "Insurgency(2014)"));
        guns.add(new Weapon(3, "COD MW2"));
        guns.add(new Weapon(4, "COD 4"));

    }
}
