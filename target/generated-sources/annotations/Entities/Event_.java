package Entities;

import Entities.Pet;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-21T23:14:17")
@StaticMetamodel(Event.class)
public class Event_ { 

    public static volatile SingularAttribute<Event, Date> date;
    public static volatile SingularAttribute<Event, Pet> petId;
    public static volatile SingularAttribute<Event, String> remark;
    public static volatile SingularAttribute<Event, Integer> id;
    public static volatile SingularAttribute<Event, String> event;

}