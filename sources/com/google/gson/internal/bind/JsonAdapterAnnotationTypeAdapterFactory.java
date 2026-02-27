package com.google.gson.internal.bind;

import D8.C0193a;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.j;
import com.google.gson.n;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.google.gson.y;
import com.google.gson.z;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements z {
    public static final z c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final z f9895d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0193a f9896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f9897b = new ConcurrentHashMap();

    public static class DummyTypeAdapterFactory implements z {
        private DummyTypeAdapterFactory() {
        }

        @Override // com.google.gson.z
        public final y a(j jVar, TypeToken typeToken) {
            throw new AssertionError("Factory should not be used");
        }

        public /* synthetic */ DummyTypeAdapterFactory(int i) {
            this();
        }
    }

    static {
        int i = 0;
        c = new DummyTypeAdapterFactory(i);
        f9895d = new DummyTypeAdapterFactory(i);
    }

    public JsonAdapterAnnotationTypeAdapterFactory(C0193a c0193a) {
        this.f9896a = c0193a;
    }

    @Override // com.google.gson.z
    public final y a(j jVar, TypeToken typeToken) {
        JsonAdapter jsonAdapter = (JsonAdapter) typeToken.getRawType().getAnnotation(JsonAdapter.class);
        if (jsonAdapter == null) {
            return null;
        }
        return b(this.f9896a, jVar, typeToken, jsonAdapter, true);
    }

    public final y b(C0193a c0193a, j jVar, TypeToken typeToken, JsonAdapter jsonAdapter, boolean z4) {
        y yVarA;
        Object objB = c0193a.c(TypeToken.get((Class) jsonAdapter.value()), true).b();
        boolean zNullSafe = jsonAdapter.nullSafe();
        if (objB instanceof y) {
            yVarA = (y) objB;
        } else if (objB instanceof z) {
            z zVar = (z) objB;
            if (z4) {
                z zVar2 = (z) this.f9897b.putIfAbsent(typeToken.getRawType(), zVar);
                if (zVar2 != null) {
                    zVar = zVar2;
                }
            }
            yVarA = zVar.a(jVar, typeToken);
        } else {
            boolean z5 = objB instanceof s;
            if (!z5 && !(objB instanceof n)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objB.getClass().getName() + " as a @JsonAdapter for " + typeToken.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            TreeTypeAdapter treeTypeAdapter = new TreeTypeAdapter(z5 ? (s) objB : null, objB instanceof n ? (n) objB : null, jVar, typeToken, z4 ? c : f9895d, zNullSafe);
            zNullSafe = false;
            yVarA = treeTypeAdapter;
        }
        return (yVarA == null || !zNullSafe) ? yVarA : yVarA.nullSafe();
    }
}
