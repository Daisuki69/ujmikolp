package com.squareup.wire;

import cj.M;
import cj.r;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.wire.internal.EnumJsonFormatter;
import com.squareup.wire.internal.ReflectionKt;
import com.squareup.wire.internal.RuntimeMessageAdapter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class WireJsonAdapterFactory implements JsonAdapter.Factory {
    private final Map<String, ProtoAdapter<?>> typeUrlToAdapter;
    private final boolean writeIdentityValues;

    /* JADX WARN: Multi-variable type inference failed */
    public WireJsonAdapterFactory() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.moshi.JsonAdapter.Factory
    public JsonAdapter<?> create(Type type, Set<? extends Annotation> annotations, Moshi moshi) {
        j.g(type, "type");
        j.g(annotations, "annotations");
        j.g(moshi, "moshi");
        Class<?> rawType = Types.getRawType(type);
        if (!annotations.isEmpty()) {
            return null;
        }
        if (j.b(rawType, AnyMessage.class)) {
            return new AnyMessageJsonAdapter(moshi, this.typeUrlToAdapter);
        }
        if (!Message.class.isAssignableFrom(rawType)) {
            if (WireEnum.class.isAssignableFrom(rawType)) {
                return new EnumJsonAdapter(new EnumJsonFormatter(RuntimeEnumAdapter.Companion.create((Class) type))).nullSafe();
            }
            return null;
        }
        RuntimeMessageAdapter runtimeMessageAdapterCreateRuntimeMessageAdapter = ReflectionKt.createRuntimeMessageAdapter((Class) type, this.writeIdentityValues, rawType.getClassLoader());
        List<JsonAdapter<Object>> listJsonAdapters = MoshiJsonIntegration.INSTANCE.jsonAdapters(runtimeMessageAdapterCreateRuntimeMessageAdapter, moshi);
        JsonAdapter jsonAdapterAdapter = moshi.adapter(Types.newParameterizedType(List.class, String.class));
        j.d(jsonAdapterAdapter);
        return new MessageJsonAdapter(runtimeMessageAdapterCreateRuntimeMessageAdapter, listJsonAdapters, jsonAdapterAdapter).nullSafe();
    }

    public final WireJsonAdapterFactory plus(List<? extends ProtoAdapter<?>> adapters) {
        j.g(adapters, "adapters");
        LinkedHashMap linkedHashMapO = M.o(this.typeUrlToAdapter);
        for (ProtoAdapter<?> protoAdapter : adapters) {
            String typeUrl = protoAdapter.getTypeUrl();
            if (typeUrl == null) {
                throw new IllegalArgumentException("recompile " + protoAdapter.getType() + " to use it with WireJsonAdapterFactory");
            }
            linkedHashMapO.put(typeUrl, protoAdapter);
        }
        return new WireJsonAdapterFactory(linkedHashMapO, this.writeIdentityValues);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WireJsonAdapterFactory(Map<String, ? extends ProtoAdapter<?>> typeUrlToAdapter) {
        this(typeUrlToAdapter, false, 2, null);
        j.g(typeUrlToAdapter, "typeUrlToAdapter");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WireJsonAdapterFactory(Map<String, ? extends ProtoAdapter<?>> typeUrlToAdapter, boolean z4) {
        j.g(typeUrlToAdapter, "typeUrlToAdapter");
        this.typeUrlToAdapter = typeUrlToAdapter;
        this.writeIdentityValues = z4;
    }

    public /* synthetic */ WireJsonAdapterFactory(Map map, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? M.e() : map, (i & 2) != 0 ? false : z4);
    }

    public final WireJsonAdapterFactory plus(ProtoAdapter<?> adapter) {
        j.g(adapter, "adapter");
        return plus(r.c(adapter));
    }
}
