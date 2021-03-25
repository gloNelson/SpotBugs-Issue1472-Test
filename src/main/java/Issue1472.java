public class Issue1472 {
    int testSA_LOCAL_SELF_COMPUTATION(){
        int flags = 1;
        return flags ^ flags; // warning SA_LOCAL_SELF_COMPUTATION
    }

    int testSA_LOCAL_SELF_COMPUTATION1(){
        int flags = 1;
        return flags & flags; // no warning (False negative)
    }

    int testSA_LOCAL_SELF_COMPUTATION2(){
        int flags = 1;
        return flags - flags; // no warning (False negative)
    }

    int testSA_LOCAL_SELF_COMPUTATION3(){
        int flags = 1;
        return flags | flags; // no warning (False negative)
    }


}
