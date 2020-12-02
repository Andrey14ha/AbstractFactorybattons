package com.test.butns;

import com.test.butns.Factory.GUFactory;
import com.test.butns.Factory.MacOcGUFactory;
import com.test.butns.Factory.WindowsGUFactory;

public class DemoApplication {
    public static String WINDOWS_TYPE = "WINDOWS_TYPE";
    public static String MAC_TYPE = "MAC_TYPE";

    public static Aplycashion configureApplication(String windowsType) {
        return null;
    }

        public Aplycashion configureAplycashion (String type){
            Aplycashion app;
            GUFactory factory;

            if (type.equals(WINDOWS_TYPE)) {
                factory = new WindowsGUFactory();
            } else {
                factory = new MacOcGUFactory();
            }
            app = new Aplycashion(factory);
            return app;
        }

}
