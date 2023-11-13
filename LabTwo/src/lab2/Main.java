package lab2;
import mypokemons.*;
import ru.ifmo.se.pokemon.*;
// https://pokemondb.net/pokedex/lombre
// https://pokemondb.net/pokedex/glaceon
// https://pokemondb.net/pokedex/poliwag
// https://pokemondb.net/pokedex/poliwhirl
// https://pokemondb.net/pokedex/poliwhirl



public class Main {

	public static void main(String[] args) {
		Battle b = new Battle();
		Pokemon lombre = new Lombre("Недовольный",2);
		Pokemon glaceon = new Glaceon("Красавчик",2);
		Pokemon gliscor = new Gliscor("Крылатый",2);
		Pokemon poliwag = new Poliwag("Морской",2);
		Pokemon poliwhirl = new Poliwhirl("Морской_лвл2",2);
		Pokemon poliwrath = new Poliwrath("Морской_лвл3",2);
		b.addAlly(lombre);
		b.addAlly(glaceon);
		b.addAlly(gliscor);
		b.addFoe(poliwag);
		b.addFoe(poliwhirl);
		b.addFoe(poliwrath);
		b.go();

	}

}
