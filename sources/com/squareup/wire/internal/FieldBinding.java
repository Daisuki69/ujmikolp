package com.squareup.wire.internal;

import X5.f;
import cj.C1110A;
import cj.M;
import com.squareup.wire.KotlinConstructorBuilder;
import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import rj.InterfaceC2210a;
import rj.InterfaceC2212c;
import rj.InterfaceC2214e;
import xj.InterfaceC2488d;
import zj.o;

/* JADX INFO: loaded from: classes4.dex */
public final class FieldBinding<M extends Message<M, B>, B extends Message.Builder<M, B>> extends FieldOrOneOfBinding<M, B> {
    public static final Companion Companion = new Companion(null);
    private static final o IS_GETTER_FIELD_NAME_REGEX = new o("^is[^a-z].*$");
    private final String adapterString;
    private final Function1<B, Object> builderGetter;
    private final Function2<B, Object, Unit> builderSetter;
    private final ClassLoader classLoader;
    private final String declaredName;
    private final Function1<M, Object> instanceGetter;
    private final String keyAdapterString;
    private final WireField.Label label;
    private final Field messageField;
    private final String name;
    private final boolean redacted;
    private final int tag;
    private final String wireFieldJsonName;
    private final boolean writeIdentityValues;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ FieldBinding(WireField wireField, Class cls, Field field, Class cls2, boolean z4, ClassLoader classLoader, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(wireField, cls, field, cls2, z4, (i & 32) != 0 ? cls.getClassLoader() : classLoader);
    }

    private final Function1<B, Object> getBuilderGetter(Class<?> cls, WireField wireField) {
        if (cls.isAssignableFrom(KotlinConstructorBuilder.class)) {
            return new a(wireField, 0);
        }
        try {
            return new a(cls.getField(getName()), 1);
        } catch (NoSuchFieldException unused) {
            throw new AssertionError("No builder field " + cls.getName() + '.' + getName());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getBuilderGetter$lambda$3(WireField wireField, Message.Builder builder) {
        j.g(builder, "builder");
        return ((KotlinConstructorBuilder) builder).get(wireField);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getBuilderGetter$lambda$4(Field field, Message.Builder builder) {
        j.g(builder, "builder");
        return field.get(builder);
    }

    private final Function2<B, Object, Unit> getBuilderSetter(Class<?> cls, WireField wireField) {
        if (cls.isAssignableFrom(KotlinConstructorBuilder.class)) {
            return new Ag.j(wireField, 16);
        }
        if (!wireField.label().isOneOf()) {
            try {
                return new Ag.j(cls.getField(getName()), 18);
            } catch (NoSuchFieldException unused) {
                throw new AssertionError("No builder field " + cls.getName() + '.' + getName());
            }
        }
        Class<?> type = this.messageField.getType();
        try {
            return new Ag.j(cls.getMethod(getName(), type), 17);
        } catch (NoSuchMethodException unused2) {
            throw new AssertionError("No builder method " + cls.getName() + '.' + getName() + '(' + type.getName() + ')');
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getBuilderSetter$lambda$0(WireField wireField, Message.Builder builder, Object obj) {
        j.g(builder, "builder");
        ((KotlinConstructorBuilder) builder).set(wireField, obj);
        return Unit.f18162a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getBuilderSetter$lambda$1(Method method, Message.Builder builder, Object obj) throws IllegalAccessException, InvocationTargetException {
        j.g(builder, "builder");
        method.invoke(builder, obj);
        return Unit.f18162a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getBuilderSetter$lambda$2(Field field, Message.Builder builder, Object obj) throws IllegalAccessException {
        j.g(builder, "builder");
        field.set(builder, obj);
        return Unit.f18162a;
    }

    private final Function1<M, Object> getInstanceGetter(Class<M> cls) {
        if (!Modifier.isPrivate(this.messageField.getModifiers())) {
            return new a(this, 3);
        }
        String name = this.messageField.getName();
        o oVar = IS_GETTER_FIELD_NAME_REGEX;
        j.d(name);
        if (!oVar.e(name)) {
            StringBuilder sb2 = new StringBuilder("get");
            if (name.length() > 0) {
                StringBuilder sb3 = new StringBuilder();
                String strValueOf = String.valueOf(name.charAt(0));
                j.e(strValueOf, "null cannot be cast to non-null type java.lang.String");
                String upperCase = strValueOf.toUpperCase(Locale.ROOT);
                j.f(upperCase, "toUpperCase(...)");
                sb3.append((Object) upperCase);
                String strSubstring = name.substring(1);
                j.f(strSubstring, "substring(...)");
                sb3.append(strSubstring);
                name = sb3.toString();
            }
            sb2.append(name);
            name = sb2.toString();
        }
        return new a(cls.getMethod(name, null), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getInstanceGetter$lambda$6(Method method, Message instance) {
        j.g(instance, "instance");
        return method.invoke(instance, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getInstanceGetter$lambda$7(FieldBinding fieldBinding, Message instance) {
        j.g(instance, "instance");
        return fieldBinding.messageField.get(instance);
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public String getDeclaredName() {
        return this.declaredName;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public ProtoAdapter<?> getKeyAdapter() {
        return ProtoAdapter.Companion.get(this.keyAdapterString, this.classLoader);
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public WireField.Label getLabel() {
        return this.label;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public String getName() {
        return this.name;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public boolean getRedacted() {
        return this.redacted;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public ProtoAdapter<?> getSingleAdapter() {
        return ProtoAdapter.Companion.get(this.adapterString, this.classLoader);
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public int getTag() {
        return this.tag;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public String getWireFieldJsonName() {
        return this.wireFieldJsonName;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public boolean getWriteIdentityValues() {
        return this.writeIdentityValues;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public boolean isMap() {
        return this.keyAdapterString.length() > 0;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public boolean isMessage() {
        InterfaceC2488d type = getSingleAdapter().getType();
        Class clsO = type != null ? f.o(type) : null;
        j.d(clsO);
        return Message.class.isAssignableFrom(clsO);
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public Object get(M message) {
        j.g(message, "message");
        return this.instanceGetter.invoke(message);
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public Object getFromBuilder(B builder) {
        j.g(builder, "builder");
        return this.builderGetter.invoke(builder);
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public void set(B builder, Object obj) {
        j.g(builder, "builder");
        this.builderSetter.invoke(builder, obj);
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public void value(B builder, Object value) {
        j.g(builder, "builder");
        j.g(value, "value");
        if (getLabel().isRepeated()) {
            Object fromBuilder = getFromBuilder((Message.Builder) builder);
            boolean z4 = fromBuilder instanceof List;
            if (z4 && (!(fromBuilder instanceof InterfaceC2210a) || (fromBuilder instanceof InterfaceC2212c))) {
                j.e(fromBuilder, "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.Any>");
                D.b(fromBuilder).add(value);
                return;
            } else if (z4) {
                ArrayList arrayListW = C1110A.W((Collection) fromBuilder);
                arrayListW.add(value);
                set((Message.Builder) builder, (Object) arrayListW);
                return;
            } else {
                throw new ClassCastException("Expected a list type, got " + (fromBuilder != null ? fromBuilder.getClass() : null) + '.');
            }
        }
        if (this.keyAdapterString.length() <= 0) {
            set((Message.Builder) builder, value);
            return;
        }
        Object fromBuilder2 = getFromBuilder((Message.Builder) builder);
        boolean z5 = fromBuilder2 instanceof Map;
        if (z5 && (!(fromBuilder2 instanceof InterfaceC2210a) || (fromBuilder2 instanceof InterfaceC2214e))) {
            ((Map) fromBuilder2).putAll((Map) value);
            return;
        }
        if (z5) {
            LinkedHashMap linkedHashMapO = M.o((Map) fromBuilder2);
            linkedHashMapO.putAll((Map) value);
            set((Message.Builder) builder, (Object) linkedHashMapO);
        } else {
            throw new ClassCastException("Expected a map type, got " + (fromBuilder2 != null ? fromBuilder2.getClass() : null) + '.');
        }
    }

    public FieldBinding(WireField wireField, Class<M> messageType, Field messageField, Class<B> builderType, boolean z4, ClassLoader classLoader) {
        String strDeclaredName;
        j.g(wireField, "wireField");
        j.g(messageType, "messageType");
        j.g(messageField, "messageField");
        j.g(builderType, "builderType");
        this.messageField = messageField;
        this.writeIdentityValues = z4;
        this.classLoader = classLoader;
        this.label = wireField.label();
        String name = messageField.getName();
        j.f(name, "getName(...)");
        this.name = name;
        this.wireFieldJsonName = wireField.jsonName();
        if (wireField.declaredName().length() == 0) {
            strDeclaredName = messageField.getName();
            j.f(strDeclaredName, "getName(...)");
        } else {
            strDeclaredName = wireField.declaredName();
        }
        this.declaredName = strDeclaredName;
        this.tag = wireField.tag();
        this.keyAdapterString = wireField.keyAdapter();
        this.adapterString = wireField.adapter();
        this.redacted = wireField.redacted();
        this.builderSetter = getBuilderSetter(builderType, wireField);
        this.builderGetter = getBuilderGetter(builderType, wireField);
        this.instanceGetter = getInstanceGetter(messageType);
    }
}
