
package expresiones;

public class EnumEjemplo {

    public enum Artistas{
        Selena_Gomez, Lady_Gaga, Camila_Cabello, Peso_Pluma, Katy_Perry
    }

    public static void main(String[] args) {
        Artistas ArtFav = Artistas.Selena_Gomez;
        Artistas Artifav = Artistas.Lady_Gaga;
        Artistas ArtisFav = Artistas.Camila_Cabello;
        Artistas ArtistFav = Artistas.Peso_Pluma;
        Artistas ArtistaFav = Artistas.Katy_Perry;

        System.out.println("Mi Artista favorito es " + ArtFav);
        System.out.println("Mi 2do Artista favorito es " + Artifav);
        System.out.println("Mi otro artista favorito es " + ArtisFav);
        System.out.println("Mi color favorito es " + ArtisFav);
        System.out.println("No me gustan las canciones de: " + ArtistFav);
        System.out.println("Me gustan las canciones de: " + ArtistaFav);
    }
}

