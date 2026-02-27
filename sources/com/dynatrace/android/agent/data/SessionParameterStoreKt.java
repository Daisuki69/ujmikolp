package com.dynatrace.android.agent.data;

import Rg.g;
import android.content.Context;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.preferences.PreferenceDataStoreDelegateKt;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesFactory;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.z;
import kotlin.reflect.KProperty;
import tj.InterfaceC2288a;

/* JADX INFO: loaded from: classes2.dex */
public final class SessionParameterStoreKt {
    static final /* synthetic */ KProperty[] $$delegatedProperties;
    public static final String TAG_SESSION_PARAMETER = "dtxSessionParameter";
    private static final InterfaceC2288a dataStore$delegate;

    static {
        r rVar = new r(SessionParameterStoreKt.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1);
        z.f18196a.getClass();
        $$delegatedProperties = new KProperty[]{rVar};
        dataStore$delegate = PreferenceDataStoreDelegateKt.preferencesDataStore$default("dynatrace-legacy-preferences", new ReplaceFileCorruptionHandler(new g(29)), null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Preferences dataStore_delegate$lambda$0(CorruptionException it) {
        j.g(it, "it");
        return PreferencesFactory.createEmpty();
    }

    public static final DataStore<Preferences> getDataStore(Context context) {
        j.g(context, "<this>");
        return (DataStore) dataStore$delegate.getValue(context, $$delegatedProperties[0]);
    }
}
