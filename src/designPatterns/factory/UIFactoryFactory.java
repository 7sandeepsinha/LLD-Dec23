package designPatterns.factory;

public class UIFactoryFactory {
    public static UIFactory getUIFactory(SupportedPlatform supportedPlatform){
        switch (supportedPlatform){
            case IOS : return new IOSFactory();
            case ANDROID: return new AndroidFactory();
            case MAC: return new MacFactory();
        }
        return null;
    }
}
// UIFactory -> manufactures -> UI components -> button, menu, dropdown etc.
// UIFactoryFactory -> manufacture -> UIFactory -> IOSFactory, AndroidFactory, MacFactory etc.