package com.squareup.wire.internal;

import X5.f;
import cj.C1129o;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireEnumConstant;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.j;
import xj.InterfaceC2488d;

/* JADX INFO: loaded from: classes4.dex */
public final class EnumJsonFormatter<E extends WireEnum> implements JsonFormatter<E> {
    private final Map<String, E> stringToValue;
    private Constructor<E> unrecognizedClassConstructor;
    private final Map<E, String> valueToString;

    /* JADX WARN: Multi-variable type inference failed */
    public EnumJsonFormatter(EnumAdapter<E> adapter) throws IllegalAccessException {
        Annotation annotation;
        j.g(adapter, "adapter");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        InterfaceC2488d type = adapter.getType();
        j.d(type);
        Class clsN = f.n(type);
        WireEnum[] wireEnumArr = (WireEnum[]) clsN.getEnumConstants();
        if (wireEnumArr == null) {
            Rj.f fVarF = D.f(clsN.getDeclaredClasses());
            while (fVarF.hasNext()) {
                Class cls = (Class) fVarF.next();
                String simpleName = cls.getSimpleName();
                if (!simpleName.equals("Companion")) {
                    Field[] declaredFields = cls.getDeclaredFields();
                    j.f(declaredFields, "getDeclaredFields(...)");
                    Field field = (Field) C1129o.r(declaredFields);
                    if (j.b(field.getName(), "INSTANCE")) {
                        Object obj = field.get(null);
                        j.e(obj, "null cannot be cast to non-null type E of com.squareup.wire.internal.EnumJsonFormatter");
                        WireEnum wireEnum = (WireEnum) obj;
                        linkedHashMap.put(cls.getSimpleName(), wireEnum);
                        linkedHashMap.put(String.valueOf(wireEnum.getValue()), wireEnum);
                        linkedHashMap2.put(wireEnum, simpleName);
                        Annotation[] annotations = cls.getAnnotations();
                        j.f(annotations, "getAnnotations(...)");
                        int length = annotations.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                annotation = null;
                                break;
                            }
                            annotation = annotations[i];
                            if (annotation instanceof WireEnumConstant) {
                                break;
                            } else {
                                i++;
                            }
                        }
                        WireEnumConstant wireEnumConstant = annotation instanceof WireEnumConstant ? (WireEnumConstant) annotation : null;
                        if (wireEnumConstant != null && wireEnumConstant.declaredName().length() > 0) {
                            linkedHashMap.put(wireEnumConstant.declaredName(), wireEnum);
                            linkedHashMap2.put(wireEnum, wireEnumConstant.declaredName());
                        }
                    } else {
                        Constructor<?>[] constructors = cls.getConstructors();
                        j.f(constructors, "getConstructors(...)");
                        Object objR = C1129o.r(constructors);
                        j.e(objR, "null cannot be cast to non-null type java.lang.reflect.Constructor<E of com.squareup.wire.internal.EnumJsonFormatter>");
                        this.unrecognizedClassConstructor = (Constructor) objR;
                    }
                }
            }
        } else {
            Rj.f fVarF2 = D.f(wireEnumArr);
            while (fVarF2.hasNext()) {
                WireEnum wireEnum2 = (WireEnum) fVarF2.next();
                j.e(wireEnum2, "null cannot be cast to non-null type kotlin.Enum<*>");
                String strName = ((Enum) wireEnum2).name();
                linkedHashMap.put(strName, wireEnum2);
                linkedHashMap.put(String.valueOf(wireEnum2.getValue()), wireEnum2);
                linkedHashMap2.put(wireEnum2, strName);
                WireEnumConstant wireEnumConstant2 = (WireEnumConstant) clsN.getDeclaredField(strName).getAnnotation(WireEnumConstant.class);
                if (wireEnumConstant2 != null && wireEnumConstant2.declaredName().length() > 0) {
                    linkedHashMap.put(wireEnumConstant2.declaredName(), wireEnum2);
                    linkedHashMap2.put(wireEnum2, wireEnumConstant2.declaredName());
                }
            }
        }
        this.stringToValue = linkedHashMap;
        this.valueToString = linkedHashMap2;
    }

    @Override // com.squareup.wire.internal.JsonFormatter
    public E fromString(String value) {
        j.g(value, "value");
        E e = this.stringToValue.get(value);
        if (e != null) {
            return e;
        }
        Constructor<E> constructor = this.unrecognizedClassConstructor;
        if (constructor != null) {
            return constructor.newInstance(Integer.valueOf(Integer.parseInt(value)));
        }
        return null;
    }

    @Override // com.squareup.wire.internal.JsonFormatter
    public Object toStringOrNumber(E value) {
        j.g(value, "value");
        String str = this.valueToString.get(value);
        return str == null ? Integer.valueOf(value.getValue()) : str;
    }
}
