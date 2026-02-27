package okio;

import cj.AbstractC1117c;
import cj.C1110A;
import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import okio.Options;

/* JADX INFO: loaded from: classes5.dex */
public final class TypedOptions<T> extends AbstractC1117c<T> implements RandomAccess {
    public static final Companion Companion = new Companion(null);
    private final List<T> list;
    private final Options options;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final <T> TypedOptions<T> of(Iterable<? extends T> values, Function1<? super T, ? extends ByteString> encode) {
            j.g(values, "values");
            j.g(encode, "encode");
            List listV = C1110A.V(values);
            Options.Companion companion = Options.Companion;
            int size = listV.size();
            ByteString[] byteStringArr = new ByteString[size];
            for (int i = 0; i < size; i++) {
                byteStringArr[i] = encode.invoke(listV.get(i));
            }
            return new TypedOptions<>(listV, companion.of(byteStringArr));
        }

        private Companion() {
        }
    }

    public TypedOptions(List<? extends T> list, Options options) {
        j.g(list, "list");
        j.g(options, "options");
        this.options = options;
        List<T> listV = C1110A.V(list);
        this.list = listV;
        if (listV.size() != options.size()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public static final <T> TypedOptions<T> of(Iterable<? extends T> iterable, Function1<? super T, ? extends ByteString> function1) {
        return Companion.of(iterable, function1);
    }

    @Override // java.util.List
    public T get(int i) {
        return this.list.get(i);
    }

    public final List<T> getList$okio() {
        return this.list;
    }

    public final Options getOptions$okio() {
        return this.options;
    }

    @Override // cj.AbstractC1115a
    public int getSize() {
        return this.list.size();
    }
}
