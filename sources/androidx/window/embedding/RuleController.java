package androidx.window.embedding;

import android.content.Context;
import androidx.annotation.XmlRes;
import androidx.window.embedding.EmbeddingBackend;
import cj.C1114E;
import java.io.IOException;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public final class RuleController {
    public static final Companion Companion = new Companion(null);
    private final EmbeddingBackend embeddingBackend;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final RuleController getInstance(Context context) {
            j.g(context, "context");
            Context applicationContext = context.getApplicationContext();
            EmbeddingBackend.Companion companion = EmbeddingBackend.Companion;
            j.f(applicationContext, "applicationContext");
            return new RuleController(companion.getInstance(applicationContext));
        }

        public final Set<EmbeddingRule> parseRules(Context context, @XmlRes int i) throws XmlPullParserException, IOException {
            j.g(context, "context");
            RuleParser ruleParser = RuleParser.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            j.f(applicationContext, "context.applicationContext");
            Set<EmbeddingRule> rules$window_release = ruleParser.parseRules$window_release(applicationContext, i);
            return rules$window_release == null ? C1114E.f9379a : rules$window_release;
        }

        private Companion() {
        }
    }

    public RuleController(EmbeddingBackend embeddingBackend) {
        j.g(embeddingBackend, "embeddingBackend");
        this.embeddingBackend = embeddingBackend;
    }

    public static final RuleController getInstance(Context context) {
        return Companion.getInstance(context);
    }

    public static final Set<EmbeddingRule> parseRules(Context context, @XmlRes int i) {
        return Companion.parseRules(context, i);
    }

    public final void addRule(EmbeddingRule rule) {
        j.g(rule, "rule");
        this.embeddingBackend.addRule(rule);
    }

    public final void clearRules() {
        this.embeddingBackend.setRules(C1114E.f9379a);
    }

    public final Set<EmbeddingRule> getRules() {
        return this.embeddingBackend.getRules();
    }

    public final void removeRule(EmbeddingRule rule) {
        j.g(rule, "rule");
        this.embeddingBackend.removeRule(rule);
    }

    public final void setRules(Set<? extends EmbeddingRule> rules) {
        j.g(rules, "rules");
        this.embeddingBackend.setRules(rules);
    }
}
