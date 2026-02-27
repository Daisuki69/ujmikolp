package com.squareup.wire;

import cj.C1110A;
import cj.C1112C;
import cj.C1124j;
import cj.I;
import cj.M;
import cj.t;
import com.squareup.wire.KotlinConstructorBuilder;
import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import com.squareup.wire.WireField;
import ej.C1449a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.B;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.j;
import kotlin.ranges.IntRange;
import okio.ByteString;
import wj.e;

/* JADX INFO: loaded from: classes4.dex */
public final class KotlinConstructorBuilder<M extends Message<M, B>, B extends Message.Builder<M, B>> extends Message.Builder<M, B> {
    private final Map<Integer, Pair<WireField, Object>> fieldValueMap;
    private final Map<Integer, Pair<WireField, Map<?, ?>>> mapFieldKeyValueMap;
    private final Class<M> messageType;
    private final Map<Integer, Pair<WireField, List<?>>> repeatedFieldValueMap;

    public static final class ProtoField {
        private final Class<?> type;
        private final WireField wireField;

        public ProtoField(Class<?> type, WireField wireField) {
            j.g(type, "type");
            j.g(wireField, "wireField");
            this.type = type;
            this.wireField = wireField;
        }

        public final Class<?> getType() {
            return this.type;
        }

        public final WireField getWireField() {
            return this.wireField;
        }
    }

    public KotlinConstructorBuilder(Class<M> messageType) {
        j.g(messageType, "messageType");
        this.messageType = messageType;
        int length = messageType.getDeclaredFields().length;
        this.fieldValueMap = new LinkedHashMap(length);
        this.repeatedFieldValueMap = new LinkedHashMap(length);
        this.mapFieldKeyValueMap = new LinkedHashMap(length);
    }

    private final void clobberOtherIsOneOfs(WireField wireField) {
        Collection<Pair<WireField, Object>> collectionValues = this.fieldValueMap.values();
        ArrayList arrayList = new ArrayList(t.l(collectionValues, 10));
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            arrayList.add((WireField) ((Pair) it.next()).f18160a);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            WireField wireField2 = (WireField) obj;
            if (j.b(wireField2.oneofName(), wireField.oneofName()) && wireField2.tag() != wireField.tag()) {
                arrayList2.add(obj);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            this.fieldValueMap.remove(Integer.valueOf(((WireField) it2.next()).tag()));
        }
    }

    private final List<ProtoField> declaredProtoFields(Class<M> cls) {
        ProtoField protoField;
        Field[] declaredFields = cls.getDeclaredFields();
        j.f(declaredFields, "getDeclaredFields(...)");
        ArrayList arrayList = new ArrayList();
        for (Field field : declaredFields) {
            Annotation[] declaredAnnotations = field.getDeclaredAnnotations();
            j.f(declaredAnnotations, "getDeclaredAnnotations(...)");
            ArrayList arrayList2 = new ArrayList();
            for (Annotation annotation : declaredAnnotations) {
                if (annotation instanceof WireField) {
                    arrayList2.add(annotation);
                }
            }
            WireField wireField = (WireField) C1110A.B(arrayList2);
            if (wireField != null) {
                Class<?> type = field.getType();
                j.f(type, "getType(...)");
                protoField = new ProtoField(type, wireField);
            } else {
                protoField = null;
            }
            if (protoField != null) {
                arrayList.add(protoField);
            }
        }
        return C1110A.Q(new Comparator() { // from class: com.squareup.wire.KotlinConstructorBuilder$declaredProtoFields$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t5, T t10) {
                return C1449a.a(Integer.valueOf(((KotlinConstructorBuilder.ProtoField) t5).getWireField().schemaIndex()), Integer.valueOf(((KotlinConstructorBuilder.ProtoField) t10).getWireField().schemaIndex()));
            }
        }, arrayList);
    }

    @Override // com.squareup.wire.Message.Builder
    public M build() throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        List<ProtoField> listDeclaredProtoFields = declaredProtoFields(this.messageType);
        C1124j c1124j = new C1124j();
        Iterator<ProtoField> it = listDeclaredProtoFields.iterator();
        while (it.hasNext()) {
            c1124j.addLast(it.next());
        }
        List<ProtoField> list = listDeclaredProtoFields;
        ArrayList arrayList = new ArrayList(t.l(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((ProtoField) it2.next()).getType());
        }
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        Class<M> cls = this.messageType;
        B b8 = new B(0);
        b8.a(clsArr);
        ArrayList arrayList2 = b8.f18173a;
        arrayList2.add(ByteString.class);
        Constructor<M> declaredConstructor = cls.getDeclaredConstructor((Class[]) arrayList2.toArray(new Class[arrayList2.size()]));
        IntRange intRange = new IntRange(0, clsArr.length, 1);
        ArrayList arrayList3 = new ArrayList(t.l(intRange, 10));
        Iterator<Integer> it3 = intRange.iterator();
        while (((e) it3).c) {
            arrayList3.add(((I) it3).nextInt() == listDeclaredProtoFields.size() ? buildUnknownFields() : get(((ProtoField) c1124j.removeFirst()).getWireField()));
        }
        Object[] array = arrayList3.toArray(new Object[0]);
        M mNewInstance = declaredConstructor.newInstance(Arrays.copyOf(array, array.length));
        j.e(mNewInstance, "null cannot be cast to non-null type M of com.squareup.wire.KotlinConstructorBuilder");
        return mNewInstance;
    }

    public final Object get(WireField field) {
        List list;
        Map map;
        j.g(field, "field");
        if (KotlinConstructorBuilderKt.isMap(field)) {
            Pair<WireField, Map<?, ?>> pair = this.mapFieldKeyValueMap.get(Integer.valueOf(field.tag()));
            return (pair == null || (map = (Map) pair.f18161b) == null) ? M.e() : map;
        }
        if (field.label().isRepeated()) {
            Pair<WireField, List<?>> pair2 = this.repeatedFieldValueMap.get(Integer.valueOf(field.tag()));
            return (pair2 == null || (list = (List) pair2.f18161b) == null) ? C1112C.f9377a : list;
        }
        Pair<WireField, Object> pair3 = this.fieldValueMap.get(Integer.valueOf(field.tag()));
        Object obj = pair3 != null ? pair3.f18161b : null;
        return (obj == null && field.label() == WireField.Label.OMIT_IDENTITY) ? ProtoAdapter.Companion.get(field.adapter()).getIdentity() : obj;
    }

    public final void set(WireField field, Object obj) {
        j.g(field, "field");
        if (KotlinConstructorBuilderKt.isMap(field)) {
            Map<Integer, Pair<WireField, Map<?, ?>>> map = this.mapFieldKeyValueMap;
            Integer numValueOf = Integer.valueOf(field.tag());
            j.e(obj, "null cannot be cast to non-null type kotlin.collections.MutableMap<*, *>");
            map.put(numValueOf, new Pair<>(field, D.c(obj)));
            return;
        }
        if (field.label().isRepeated()) {
            Map<Integer, Pair<WireField, List<?>>> map2 = this.repeatedFieldValueMap;
            Integer numValueOf2 = Integer.valueOf(field.tag());
            j.e(obj, "null cannot be cast to non-null type kotlin.collections.MutableList<*>");
            map2.put(numValueOf2, new Pair<>(field, D.b(obj)));
            return;
        }
        this.fieldValueMap.put(Integer.valueOf(field.tag()), new Pair<>(field, obj));
        if (obj == null || !field.label().isOneOf()) {
            return;
        }
        clobberOtherIsOneOfs(field);
    }
}
