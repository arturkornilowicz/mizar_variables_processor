package org.mizar.classes;

import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class ClusteredType extends Type {

    private AdjectiveCluster adjectiveCluster;
    private Type type;

    public ClusteredType(Element element) {
        super(element);
        adjectiveCluster = new AdjectiveCluster(element.element(ElementNames.ADJECTIVE_CLUSTER));
        type = Type.buildType(element.elements().get(1));
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        adjectiveCluster.run();
        type.run();
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
