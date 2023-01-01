

import java.lang.reflect.Constructor;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;

import Buildings.WoodHouse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class ClassReader {

    private static final Logger LOGGER = LogManager.getLogger(ClassReader.class);

    public static void read() {

        try {

            Constructor<?>[] cons = WoodHouse.class.getDeclaredConstructors();

            for (Constructor each : cons)
                LOGGER.info("Constructor of class:  " + each.toString());

            WoodHouse woodHouse = (WoodHouse) cons[1].newInstance(10, 10, 0, 5, 0, 1, 1, 3, 40);

            Field[] firstFields = woodHouse.getClass().getDeclaredFields();
            LOGGER.info("fields in class:  " + firstFields.toString());

            for (Field each : firstFields)
                LOGGER.info(" field in class:  " + each.toString());

            TypeVariable<?>[] parameterType = cons.getClass().getTypeParameters();

            Class<? extends WoodHouse> fs = woodHouse.getClass();
            String methodName = null;

            Method[] m = woodHouse.getClass().getDeclaredMethods();

            for (Method each : m)
                LOGGER.info("methods in class:  " + each.toString());

            Method method = woodHouse.getClass().getDeclaredMethod("toString");

            // method.setAccessible(true);
            LOGGER.info(method.invoke(woodHouse));

        } catch (InstantiationException e) {

            LOGGER.info(e);
        } catch (IllegalAccessException e) {

            LOGGER.info(e);
        } catch (IllegalArgumentException e) {

            LOGGER.info(e);
        } catch (InvocationTargetException e) {

            LOGGER.info(e);
        } catch (SecurityException e) {

            LOGGER.info(e);
        } catch (NoSuchMethodException e) {

            LOGGER.info(e);
        }
    }

    public static void callMethodByName(Object object, String methodName)
            throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        object.getClass().getDeclaredMethod(methodName).invoke(object);
    }

    public static void callMethodByName(Object object, String methodName, int i, String s)
            throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        object.getClass().getDeclaredMethod(methodName, int.class, String.class).invoke(object, i, s);
    }

}
