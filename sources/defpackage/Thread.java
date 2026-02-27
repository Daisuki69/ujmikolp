package defpackage;

import androidx.media3.exoplayer.analytics.AnalyticsListener;
import cj.C1110A;
import cj.C1112C;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import okio.ByteString;

/* JADX INFO: loaded from: classes5.dex */
public final class Thread extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "backtraceNote", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 7)
    private final List<String> backtrace_note;

    @WireField(adapter = "BacktraceFrame#ADAPTER", jsonName = "currentBacktrace", label = WireField.Label.REPEATED, schemaIndex = 5, tag = 4)
    private final List<BacktraceFrame> current_backtrace;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final int id;

    @WireField(adapter = "MemoryDump#ADAPTER", jsonName = "memoryDump", label = WireField.Label.REPEATED, schemaIndex = 6, tag = 5)
    private final List<MemoryDump> memory_dump;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", jsonName = "pacEnabledKeys", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 8)
    private final long pac_enabled_keys;

    @WireField(adapter = "Register#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<Register> registers;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", jsonName = "taggedAddrCtrl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 6)
    private final long tagged_addr_ctrl;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "unreadableElfFiles", label = WireField.Label.REPEATED, schemaIndex = 4, tag = 9)
    private final List<String> unreadable_elf_files;
    public static final A0 Companion = new A0();
    public static final ProtoAdapter<Thread> ADAPTER = new z0(FieldEncoding.LENGTH_DELIMITED, z.a(Thread.class), "type.googleapis.com/Thread", Syntax.PROTO_3, null, "tombstone.proto");

    public Thread() {
        this(0, null, null, null, null, null, null, 0L, 0L, null, AnalyticsListener.EVENT_DRM_KEYS_LOADED, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Thread copy$default(Thread thread, int i, String str, List list, List list2, List list3, List list4, List list5, long j, long j6, ByteString byteString, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = thread.id;
        }
        if ((i4 & 2) != 0) {
            str = thread.name;
        }
        if ((i4 & 4) != 0) {
            list = thread.registers;
        }
        if ((i4 & 8) != 0) {
            list2 = thread.backtrace_note;
        }
        if ((i4 & 16) != 0) {
            list3 = thread.unreadable_elf_files;
        }
        if ((i4 & 32) != 0) {
            list4 = thread.current_backtrace;
        }
        if ((i4 & 64) != 0) {
            list5 = thread.memory_dump;
        }
        if ((i4 & 128) != 0) {
            j = thread.tagged_addr_ctrl;
        }
        if ((i4 & 256) != 0) {
            j6 = thread.pac_enabled_keys;
        }
        if ((i4 & 512) != 0) {
            byteString = thread.unknownFields();
        }
        ByteString byteString2 = byteString;
        long j7 = j6;
        long j9 = j;
        List list6 = list4;
        List list7 = list5;
        List list8 = list3;
        List list9 = list;
        return thread.copy(i, str, list9, list2, list8, list6, list7, j9, j7, byteString2);
    }

    public final Thread copy(int i, String name, List<Register> registers, List<String> backtrace_note, List<String> unreadable_elf_files, List<BacktraceFrame> current_backtrace, List<MemoryDump> memory_dump, long j, long j6, ByteString unknownFields) {
        j.g(name, "name");
        j.g(registers, "registers");
        j.g(backtrace_note, "backtrace_note");
        j.g(unreadable_elf_files, "unreadable_elf_files");
        j.g(current_backtrace, "current_backtrace");
        j.g(memory_dump, "memory_dump");
        j.g(unknownFields, "unknownFields");
        return new Thread(i, name, registers, backtrace_note, unreadable_elf_files, current_backtrace, memory_dump, j, j6, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Thread)) {
            return false;
        }
        Thread thread = (Thread) obj;
        return j.b(unknownFields(), thread.unknownFields()) && this.id == thread.id && j.b(this.name, thread.name) && j.b(this.registers, thread.registers) && j.b(this.backtrace_note, thread.backtrace_note) && j.b(this.unreadable_elf_files, thread.unreadable_elf_files) && j.b(this.current_backtrace, thread.current_backtrace) && j.b(this.memory_dump, thread.memory_dump) && this.tagged_addr_ctrl == thread.tagged_addr_ctrl && this.pac_enabled_keys == thread.pac_enabled_keys;
    }

    public final List<String> getBacktrace_note() {
        return this.backtrace_note;
    }

    public final List<BacktraceFrame> getCurrent_backtrace() {
        return this.current_backtrace;
    }

    public final int getId() {
        return this.id;
    }

    public final List<MemoryDump> getMemory_dump() {
        return this.memory_dump;
    }

    public final String getName() {
        return this.name;
    }

    public final long getPac_enabled_keys() {
        return this.pac_enabled_keys;
    }

    public final List<Register> getRegisters() {
        return this.registers;
    }

    public final long getTagged_addr_ctrl() {
        return this.tagged_addr_ctrl;
    }

    public final List<String> getUnreadable_elf_files() {
        return this.unreadable_elf_files;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iD = AbstractC1414e.d(this.memory_dump, AbstractC1414e.d(this.current_backtrace, AbstractC1414e.d(this.unreadable_elf_files, AbstractC1414e.d(this.backtrace_note, AbstractC1414e.d(this.registers, AbstractC1414e.c(((unknownFields().hashCode() * 37) + this.id) * 37, 37, this.name), 37), 37), 37), 37), 37);
        long j = this.tagged_addr_ctrl;
        long j6 = this.pac_enabled_keys;
        int i4 = ((iD + ((int) (j ^ (j >>> 32)))) * 37) + ((int) (j6 ^ (j6 >>> 32)));
        this.hashCode = i4;
        return i4;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m34newBuilder();
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + this.id);
        AbstractC1414e.p(this.name, new StringBuilder("name="), arrayList);
        if (!this.registers.isEmpty()) {
            AbstractC1414e.s(new StringBuilder("registers="), this.registers, arrayList);
        }
        if (!this.backtrace_note.isEmpty()) {
            arrayList.add("backtrace_note=" + Internal.sanitize(this.backtrace_note));
        }
        if (!this.unreadable_elf_files.isEmpty()) {
            arrayList.add("unreadable_elf_files=" + Internal.sanitize(this.unreadable_elf_files));
        }
        if (!this.current_backtrace.isEmpty()) {
            AbstractC1414e.s(new StringBuilder("current_backtrace="), this.current_backtrace, arrayList);
        }
        if (!this.memory_dump.isEmpty()) {
            AbstractC1414e.s(new StringBuilder("memory_dump="), this.memory_dump, arrayList);
        }
        arrayList.add("tagged_addr_ctrl=" + this.tagged_addr_ctrl);
        arrayList.add("pac_enabled_keys=" + this.pac_enabled_keys);
        return C1110A.F(arrayList, ", ", "Thread{", "}", null, 56);
    }

    public Thread(int i, String str, List list, List list2, List list3, List list4, List list5, long j, long j6, ByteString byteString, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? "" : str, (i4 & 4) != 0 ? C1112C.f9377a : list, (i4 & 8) != 0 ? C1112C.f9377a : list2, (i4 & 16) != 0 ? C1112C.f9377a : list3, (i4 & 32) != 0 ? C1112C.f9377a : list4, (i4 & 64) != 0 ? C1112C.f9377a : list5, (i4 & 128) != 0 ? 0L : j, (i4 & 256) == 0 ? j6 : 0L, (i4 & 512) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m34newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Thread(int i, String name, List<Register> registers, List<String> backtrace_note, List<String> unreadable_elf_files, List<BacktraceFrame> current_backtrace, List<MemoryDump> memory_dump, long j, long j6, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        j.g(name, "name");
        j.g(registers, "registers");
        j.g(backtrace_note, "backtrace_note");
        j.g(unreadable_elf_files, "unreadable_elf_files");
        j.g(current_backtrace, "current_backtrace");
        j.g(memory_dump, "memory_dump");
        j.g(unknownFields, "unknownFields");
        this.id = i;
        this.name = name;
        this.tagged_addr_ctrl = j;
        this.pac_enabled_keys = j6;
        this.registers = Internal.immutableCopyOf("registers", registers);
        this.backtrace_note = Internal.immutableCopyOf("backtrace_note", backtrace_note);
        this.unreadable_elf_files = Internal.immutableCopyOf("unreadable_elf_files", unreadable_elf_files);
        this.current_backtrace = Internal.immutableCopyOf("current_backtrace", current_backtrace);
        this.memory_dump = Internal.immutableCopyOf("memory_dump", memory_dump);
    }
}
