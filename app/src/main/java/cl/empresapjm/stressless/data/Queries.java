package cl.empresapjm.stressless.data;

import java.util.ArrayList;
import java.util.List;

import cl.empresapjm.stressless.models.Pending;

/**
 * Created by Pablo on 14-08-2017.
 */

public class Queries {

    public List<Pending> pendings(){

        List<Pending> pendings =  new ArrayList<>();
        List<Pending> pendingList =  Pending.listAll(Pending.class);

        if (pendingList != null && pendingList.size()>0){
            pendings.addAll(pendingList);
        }
        return pendings;
    }
}
