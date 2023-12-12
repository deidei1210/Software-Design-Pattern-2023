package AbstractFactory;

public interface JudgeIngredientFactory {

    Race CreateRace(String race);   // Race product

    GameType CreateType(String race);   // GameType product


}
