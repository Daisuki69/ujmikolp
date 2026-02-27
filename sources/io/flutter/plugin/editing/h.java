package io.flutter.plugin.editing;

import android.view.textservice.SentenceSuggestionsInfo;
import android.view.textservice.SpellCheckerSession;
import android.view.textservice.SuggestionsInfo;
import android.view.textservice.TextInfo;
import android.view.textservice.TextServicesManager;
import io.flutter.embedding.engine.systemchannels.SpellCheckChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import mx_android.support.v7.media.MediaRouteProviderProtocol;
import pg.t;
import qg.C2174b;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements SpellCheckChannel.SpellCheckMethodHandler, SpellCheckerSession.SpellCheckerSessionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SpellCheckChannel f17190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextServicesManager f17191b;
    public SpellCheckerSession c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public t f17192d;

    public h(TextServicesManager textServicesManager, SpellCheckChannel spellCheckChannel) {
        this.f17191b = textServicesManager;
        this.f17190a = spellCheckChannel;
        spellCheckChannel.setSpellCheckMethodHandler(this);
    }

    @Override // io.flutter.embedding.engine.systemchannels.SpellCheckChannel.SpellCheckMethodHandler
    public final void initiateSpellCheck(String str, String str2, t tVar) {
        if (this.f17192d != null) {
            tVar.error(MediaRouteProviderProtocol.SERVICE_DATA_ERROR, "Previous spell check request still pending.", null);
            return;
        }
        this.f17192d = tVar;
        Locale localeA = C2174b.a(str);
        if (this.c == null) {
            this.c = this.f17191b.newSpellCheckerSession(null, localeA, this, true);
        }
        this.c.getSentenceSuggestions(new TextInfo[]{new TextInfo(str2)}, 5);
    }

    @Override // android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener
    public final void onGetSentenceSuggestions(SentenceSuggestionsInfo[] sentenceSuggestionsInfoArr) {
        if (sentenceSuggestionsInfoArr.length == 0) {
            this.f17192d.success(new ArrayList());
            this.f17192d = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        SentenceSuggestionsInfo sentenceSuggestionsInfo = sentenceSuggestionsInfoArr[0];
        if (sentenceSuggestionsInfo == null) {
            this.f17192d.success(new ArrayList());
            this.f17192d = null;
            return;
        }
        for (int i = 0; i < sentenceSuggestionsInfo.getSuggestionsCount(); i++) {
            SuggestionsInfo suggestionsInfoAt = sentenceSuggestionsInfo.getSuggestionsInfoAt(i);
            int suggestionsCount = suggestionsInfoAt.getSuggestionsCount();
            if (suggestionsCount > 0) {
                HashMap map = new HashMap();
                int offsetAt = sentenceSuggestionsInfo.getOffsetAt(i);
                int lengthAt = sentenceSuggestionsInfo.getLengthAt(i) + offsetAt;
                map.put("startIndex", Integer.valueOf(offsetAt));
                map.put("endIndex", Integer.valueOf(lengthAt));
                ArrayList arrayList2 = new ArrayList();
                boolean z4 = false;
                for (int i4 = 0; i4 < suggestionsCount; i4++) {
                    String suggestionAt = suggestionsInfoAt.getSuggestionAt(i4);
                    if (!suggestionAt.equals("")) {
                        arrayList2.add(suggestionAt);
                        z4 = true;
                    }
                }
                if (z4) {
                    map.put("suggestions", arrayList2);
                    arrayList.add(map);
                }
            }
        }
        this.f17192d.success(arrayList);
        this.f17192d = null;
    }

    @Override // android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener
    public final void onGetSuggestions(SuggestionsInfo[] suggestionsInfoArr) {
    }
}
