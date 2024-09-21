public class Fraction extends java.lang.Number{
    private int numerateur;
    private int denominateur;
    private static final Fraction ZERO = new Fraction(0,1);
    private static final Fraction UN = new Fraction(1,1);
    public Fraction(int numerateur, int denominateur){
        if (denominateur == 0) {
            throw new IllegalArgumentException("Le dénominateur ne peut pas être égal à 0");
        }
        this.denominateur=denominateur;
        this.numerateur=numerateur;
    }
    public Fraction(int numerateur){
        this.numerateur=numerateur;
        this.denominateur=1;
    }
    public Fraction(){
        this.numerateur=0;
        this.denominateur=1;
    }
    public static void main ( String [] args ){
        Fraction a= new Fraction();
        Fraction b= new Fraction(5);
        Fraction c= new Fraction(5,2);
        assert a.compareTo(a)==0;
        assert a.compareTo(b)<0;
        assert b.compareTo(c)>0;
        assert a.equals(a)==true;
        assert a.equals(b)==false;
        assert b.equals(c)==false;
        assert a.toString()=="je suis une fraction, nominateur=0, denominateur=1.";
        assert b.toString()=="je suis une fraction, nominateur=5, denominateur=1.";
        assert c.toString()=="je suis une fraction, nominateur=6, denominateur=2.";
        assert a.doubleValue()==0.0;
        assert b.doubleValue()==5.0;
        assert c.doubleValue()==2.5;
        assert a.add(a)==new Fraction(0,1);
        assert a.add(b)==new Fraction(5,1);
        assert b.add(c)==new Fraction(15,2);
        System.out.println(a.getDenominateur());
        System.out.println(a.getNumerateur());
        System.out.println(b.add(c));
        Number aNumber = java.math.BigDecimal.ONE;
        Number anotherNumber = new Fraction(1, 2);
        assert java.lang.Math.abs(aNumber.doubleValue() + anotherNumber.doubleValue() - 1.5) < 1E-8;
    }
    public String toString(){
        return "je suis une fraction, nominateur="+numerateur+", denominateur="+denominateur+".";
    }
    public int getDenominateur() {
        return denominateur;
    }
    public int getNumerateur() {
        return numerateur;
    }
    public double doubleValue(){
        return numerateur/denominateur;
    }
    public Fraction add(Fraction frac){
        int numerateur=this.numerateur*frac.denominateur + this.denominateur*frac.numerateur;
        int denominateur=this.denominateur*frac.denominateur;
        return new Fraction(numerateur,denominateur);
    }
    public boolean equals(Fraction frac){
        return this.numerateur*frac.denominateur==this.denominateur*frac.numerateur;
    }
    public int compareTo(Fraction frac) {
        int nominateur = this.numerateur * frac.denominateur;
        int denominateur = this.denominateur * frac.numerateur;
        return Integer.compare(nominateur, denominateur);
    }
    public int intValue(){
        return numerateur/denominateur;
    }
    public float floatValue(){
        return numerateur/denominateur;
    }
    public long longValue(){
        return numerateur/denominateur;
    }
    
}
