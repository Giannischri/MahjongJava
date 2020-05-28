/*Γιαννης Χριστοδουλου icsd17222
κωνσταντινος Πλατσατουρας icsd17159*/
 /*δημιουργια Interface hints το οποιο περιεχει μεθοδους τις οποιες θα επιλεξει ο χρηστης για να βοηθηθει στο παιχνιδι(οι μεθοδοι υλοποιουνται στην κλαση που κληρονομει αυτο το Interface*/
public interface Hints {

    public void showfreetiles();

    /*μεθοδος η οποια εμφανιζει ολα τα ελευθερα πλακιδια του πινακα*/
    public void tilesrefresh();

    /*μεθοδος η οποια ανακατευει τα πλακιδια*/
    public void showfreepair();

    /*εμφανιζει ενα ζευγαρι το οποιο μπορει να αφαιρεθει*/
    public void randomfreepair();

    /*διαγραφει ενα τυχαιο ζευγαρι το οποιο εχει την δυνατοτητα να αφαιρεθει(δεν ειναι μπλοκαρισμενο)*/
    public void helpsetup();
    

    /*μεθοδος η οποια οριζει ποσες φορες μπορει να χρησημοποιησει ο χρηστης τις παραπανω μεθοδους αναλογα με το επιπεδο δυσκολιας που επελεξε*/
public void helpchoose();

/*μεθοδος η οποια βαζει τον χρηστη να επιλεξει ενα απο τα 4 ειδη βοηθειας*/
}

