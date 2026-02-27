package com.google.gson.internal.bind;

import com.google.gson.j;
import com.google.gson.reflect.TypeToken;
import com.google.gson.y;
import com.google.gson.z;
import g3.InterfaceC1498b;
import java.io.IOException;
import java.lang.Enum;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
class EnumTypeAdapter<T extends Enum<T>> extends y {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final z f9892d = new z() { // from class: com.google.gson.internal.bind.EnumTypeAdapter.1
        @Override // com.google.gson.z
        public final y a(j jVar, TypeToken typeToken) {
            Class rawType = typeToken.getRawType();
            if (!Enum.class.isAssignableFrom(rawType) || rawType == Enum.class) {
                return null;
            }
            if (!rawType.isEnum()) {
                rawType = rawType.getSuperclass();
            }
            return new EnumTypeAdapter(rawType);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f9893a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f9894b = new HashMap();
    public final HashMap c = new HashMap();

    public EnumTypeAdapter(Class cls) {
        try {
            Field[] declaredFields = cls.getDeclaredFields();
            int i = 0;
            for (Field field : declaredFields) {
                if (field.isEnumConstant()) {
                    declaredFields[i] = field;
                    i++;
                }
            }
            Field[] fieldArr = (Field[]) Arrays.copyOf(declaredFields, i);
            AccessibleObject.setAccessible(fieldArr, true);
            for (Field field2 : fieldArr) {
                Enum r42 = (Enum) field2.get(null);
                String strName = r42.name();
                String string = r42.toString();
                InterfaceC1498b interfaceC1498b = (InterfaceC1498b) field2.getAnnotation(InterfaceC1498b.class);
                if (interfaceC1498b != null) {
                    strName = interfaceC1498b.value();
                    for (String str : interfaceC1498b.alternate()) {
                        this.f9893a.put(str, r42);
                    }
                }
                this.f9893a.put(strName, r42);
                this.f9894b.put(string, r42);
                this.c.put(r42, strName);
            }
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }

    @Override // com.google.gson.y
    public final Object read(j3.a aVar) {
        if (aVar.peek() == 9) {
            aVar.G();
            return null;
        }
        String strI = aVar.I();
        Enum r02 = (Enum) this.f9893a.get(strI);
        return r02 == null ? (Enum) this.f9894b.get(strI) : r02;
    }

    @Override // com.google.gson.y
    public final void write(j3.b bVar, Object obj) throws IOException {
        Enum r32 = (Enum) obj;
        bVar.E(r32 == null ? null : (String) this.c.get(r32));
    }
}
