package models;

public class Constant {
    
    public class UserTypes {

        public static final String MECANICO = "ROLE_MECANICO";
        public static final String COORDENADOR = "ROLE_COORDENADOR";
    }

    public class MecanicoTypes {

        public static final String EFETIVO = "Efetivo";
        public static final String ESTAGIARIO = "Estagiario";
    }

    public class domain {

        public static final String DOMAIN = "http://localhost:8090";  
//      public static final String DOMAIN = "https://api.bobauto.ml";
    }

    public class ResponseType {

        public static final String SUCESS = "SUCESS";
        public static final String ERROR = "ERROR";
        public static final String INFO = "INFO";
    }

    public class authorization {

        public static final String AUTH_TOKEN_NAME = "authToken";
    }
}