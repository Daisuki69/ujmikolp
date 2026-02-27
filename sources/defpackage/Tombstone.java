package defpackage;

import cj.C1110A;
import cj.C1112C;
import cj.M;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import okio.ByteString;

/* JADX INFO: loaded from: classes5.dex */
public final class Tombstone extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "abortMessage", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 14)
    private final String abort_message;

    @WireField(adapter = "Architecture#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final EnumC0842b arch;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "buildFingerprint", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 2)
    private final String build_fingerprint;

    @WireField(adapter = "Cause#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 14, tag = 15)
    private final List<Cause> causes;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "commandLine", label = WireField.Label.REPEATED, schemaIndex = 9, tag = 9)
    private final List<String> command_line;

    @WireField(adapter = "CrashDetail#ADAPTER", jsonName = "crashDetails", label = WireField.Label.REPEATED, schemaIndex = 13, tag = 21)
    private final List<CrashDetail> crash_details;

    @WireField(adapter = "Architecture#ADAPTER", jsonName = "guestArch", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 24)
    private final EnumC0842b guest_arch;

    @WireField(adapter = "Thread#ADAPTER", jsonName = "guestThreads", keyAdapter = "com.squareup.wire.ProtoAdapter#UINT32", schemaIndex = 16, tag = 25)
    private final Map<Integer, Thread> guest_threads;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "hasBeen16kbMode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 21, tag = 23)
    private final boolean has_been_16kb_mode;

    @WireField(adapter = "LogBuffer#ADAPTER", jsonName = "logBuffers", label = WireField.Label.REPEATED, schemaIndex = 18, tag = 18)
    private final List<LogBuffer> log_buffers;

    @WireField(adapter = "MemoryMapping#ADAPTER", jsonName = "memoryMappings", label = WireField.Label.REPEATED, schemaIndex = 17, tag = 17)
    private final List<MemoryMapping> memory_mappings;

    @WireField(adapter = "FD#ADAPTER", jsonName = "openFds", label = WireField.Label.REPEATED, schemaIndex = 19, tag = 19)
    private final List<FD> open_fds;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "pageSize", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 20, tag = 22)
    private final int page_size;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 5)
    private final int pid;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "processUptime", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 20)
    private final int process_uptime;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 3)
    private final String revision;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "selinuxLabel", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 8)
    private final String selinux_label;

    @WireField(adapter = "Signal#ADAPTER", jsonName = "signalInfo", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 10)
    private final Signal signal_info;

    @WireField(adapter = "StackHistoryBuffer#ADAPTER", jsonName = "stackHistoryBuffer", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 22, tag = 26)
    private final StackHistoryBuffer stack_history_buffer;

    @WireField(adapter = "Thread#ADAPTER", keyAdapter = "com.squareup.wire.ProtoAdapter#UINT32", schemaIndex = 15, tag = 16)
    private final Map<Integer, Thread> threads;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 6)
    private final int tid;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 4)
    private final String timestamp;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 7)
    private final int uid;
    public static final D0 Companion = new D0();
    public static final ProtoAdapter<Tombstone> ADAPTER = new C0(FieldEncoding.LENGTH_DELIMITED, z.a(Tombstone.class), Syntax.PROTO_3);

    public Tombstone() {
        this(null, null, null, null, null, 0, 0, 0, null, null, 0, null, null, null, null, null, null, null, null, null, 0, false, null, null, 16777215, null);
    }

    public final Tombstone copy(EnumC0842b arch, EnumC0842b guest_arch, String build_fingerprint, String revision, String timestamp, int i, int i4, int i6, String selinux_label, List<String> command_line, int i10, Signal signal, String abort_message, List<CrashDetail> crash_details, List<Cause> causes, Map<Integer, Thread> threads, Map<Integer, Thread> guest_threads, List<MemoryMapping> memory_mappings, List<LogBuffer> log_buffers, List<FD> open_fds, int i11, boolean z4, StackHistoryBuffer stackHistoryBuffer, ByteString unknownFields) {
        j.g(arch, "arch");
        j.g(guest_arch, "guest_arch");
        j.g(build_fingerprint, "build_fingerprint");
        j.g(revision, "revision");
        j.g(timestamp, "timestamp");
        j.g(selinux_label, "selinux_label");
        j.g(command_line, "command_line");
        j.g(abort_message, "abort_message");
        j.g(crash_details, "crash_details");
        j.g(causes, "causes");
        j.g(threads, "threads");
        j.g(guest_threads, "guest_threads");
        j.g(memory_mappings, "memory_mappings");
        j.g(log_buffers, "log_buffers");
        j.g(open_fds, "open_fds");
        j.g(unknownFields, "unknownFields");
        return new Tombstone(arch, guest_arch, build_fingerprint, revision, timestamp, i, i4, i6, selinux_label, command_line, i10, signal, abort_message, crash_details, causes, threads, guest_threads, memory_mappings, log_buffers, open_fds, i11, z4, stackHistoryBuffer, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Tombstone)) {
            return false;
        }
        Tombstone tombstone = (Tombstone) obj;
        return j.b(unknownFields(), tombstone.unknownFields()) && this.arch == tombstone.arch && this.guest_arch == tombstone.guest_arch && j.b(this.build_fingerprint, tombstone.build_fingerprint) && j.b(this.revision, tombstone.revision) && j.b(this.timestamp, tombstone.timestamp) && this.pid == tombstone.pid && this.tid == tombstone.tid && this.uid == tombstone.uid && j.b(this.selinux_label, tombstone.selinux_label) && j.b(this.command_line, tombstone.command_line) && this.process_uptime == tombstone.process_uptime && j.b(this.signal_info, tombstone.signal_info) && j.b(this.abort_message, tombstone.abort_message) && j.b(this.crash_details, tombstone.crash_details) && j.b(this.causes, tombstone.causes) && j.b(this.threads, tombstone.threads) && j.b(this.guest_threads, tombstone.guest_threads) && j.b(this.memory_mappings, tombstone.memory_mappings) && j.b(this.log_buffers, tombstone.log_buffers) && j.b(this.open_fds, tombstone.open_fds) && this.page_size == tombstone.page_size && this.has_been_16kb_mode == tombstone.has_been_16kb_mode && j.b(this.stack_history_buffer, tombstone.stack_history_buffer);
    }

    public final String getAbort_message() {
        return this.abort_message;
    }

    public final EnumC0842b getArch() {
        return this.arch;
    }

    public final String getBuild_fingerprint() {
        return this.build_fingerprint;
    }

    public final List<Cause> getCauses() {
        return this.causes;
    }

    public final List<String> getCommand_line() {
        return this.command_line;
    }

    public final List<CrashDetail> getCrash_details() {
        return this.crash_details;
    }

    public final EnumC0842b getGuest_arch() {
        return this.guest_arch;
    }

    public final Map<Integer, Thread> getGuest_threads() {
        return this.guest_threads;
    }

    public final boolean getHas_been_16kb_mode() {
        return this.has_been_16kb_mode;
    }

    public final List<LogBuffer> getLog_buffers() {
        return this.log_buffers;
    }

    public final List<MemoryMapping> getMemory_mappings() {
        return this.memory_mappings;
    }

    public final List<FD> getOpen_fds() {
        return this.open_fds;
    }

    public final int getPage_size() {
        return this.page_size;
    }

    public final int getPid() {
        return this.pid;
    }

    public final int getProcess_uptime() {
        return this.process_uptime;
    }

    public final String getRevision() {
        return this.revision;
    }

    public final String getSelinux_label() {
        return this.selinux_label;
    }

    public final Signal getSignal_info() {
        return this.signal_info;
    }

    public final StackHistoryBuffer getStack_history_buffer() {
        return this.stack_history_buffer;
    }

    public final Map<Integer, Thread> getThreads() {
        return this.threads;
    }

    public final int getTid() {
        return this.tid;
    }

    public final String getTimestamp() {
        return this.timestamp;
    }

    public final int getUid() {
        return this.uid;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iD = (AbstractC1414e.d(this.command_line, AbstractC1414e.c((((((AbstractC1414e.c(AbstractC1414e.c(AbstractC1414e.c((this.guest_arch.hashCode() + ((this.arch.hashCode() + (unknownFields().hashCode() * 37)) * 37)) * 37, 37, this.build_fingerprint), 37, this.revision), 37, this.timestamp) + this.pid) * 37) + this.tid) * 37) + this.uid) * 37, 37, this.selinux_label), 37) + this.process_uptime) * 37;
        Signal signal = this.signal_info;
        int iD2 = (((AbstractC1414e.d(this.open_fds, AbstractC1414e.d(this.log_buffers, AbstractC1414e.d(this.memory_mappings, (this.guest_threads.hashCode() + ((this.threads.hashCode() + AbstractC1414e.d(this.causes, AbstractC1414e.d(this.crash_details, AbstractC1414e.c((iD + (signal != null ? signal.hashCode() : 0)) * 37, 37, this.abort_message), 37), 37)) * 37)) * 37, 37), 37), 37) + this.page_size) * 37) + (this.has_been_16kb_mode ? 1231 : 1237)) * 37;
        StackHistoryBuffer stackHistoryBuffer = this.stack_history_buffer;
        int iHashCode = iD2 + (stackHistoryBuffer != null ? stackHistoryBuffer.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m35newBuilder();
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("arch=" + this.arch);
        arrayList.add("guest_arch=" + this.guest_arch);
        arrayList.add("build_fingerprint=" + Internal.sanitize(this.build_fingerprint));
        arrayList.add("revision=" + Internal.sanitize(this.revision));
        arrayList.add("timestamp=" + Internal.sanitize(this.timestamp));
        arrayList.add("pid=" + this.pid);
        arrayList.add("tid=" + this.tid);
        arrayList.add("uid=" + this.uid);
        AbstractC1414e.p(this.selinux_label, new StringBuilder("selinux_label="), arrayList);
        if (!this.command_line.isEmpty()) {
            arrayList.add("command_line=" + Internal.sanitize(this.command_line));
        }
        arrayList.add("process_uptime=" + this.process_uptime);
        if (this.signal_info != null) {
            arrayList.add("signal_info=" + this.signal_info);
        }
        AbstractC1414e.p(this.abort_message, new StringBuilder("abort_message="), arrayList);
        if (!this.crash_details.isEmpty()) {
            AbstractC1414e.s(new StringBuilder("crash_details="), this.crash_details, arrayList);
        }
        if (!this.causes.isEmpty()) {
            AbstractC1414e.s(new StringBuilder("causes="), this.causes, arrayList);
        }
        if (!this.threads.isEmpty()) {
            arrayList.add("threads=" + this.threads);
        }
        if (!this.guest_threads.isEmpty()) {
            arrayList.add("guest_threads=" + this.guest_threads);
        }
        if (!this.memory_mappings.isEmpty()) {
            AbstractC1414e.s(new StringBuilder("memory_mappings="), this.memory_mappings, arrayList);
        }
        if (!this.log_buffers.isEmpty()) {
            AbstractC1414e.s(new StringBuilder("log_buffers="), this.log_buffers, arrayList);
        }
        if (!this.open_fds.isEmpty()) {
            AbstractC1414e.s(new StringBuilder("open_fds="), this.open_fds, arrayList);
        }
        arrayList.add("page_size=" + this.page_size);
        arrayList.add("has_been_16kb_mode=" + this.has_been_16kb_mode);
        if (this.stack_history_buffer != null) {
            arrayList.add("stack_history_buffer=" + this.stack_history_buffer);
        }
        return C1110A.F(arrayList, ", ", "Tombstone{", "}", null, 56);
    }

    public Tombstone(EnumC0842b enumC0842b, EnumC0842b enumC0842b2, String str, String str2, String str3, int i, int i4, int i6, String str4, List list, int i10, Signal signal, String str5, List list2, List list3, Map map, Map map2, List list4, List list5, List list6, int i11, boolean z4, StackHistoryBuffer stackHistoryBuffer, ByteString byteString, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? EnumC0842b.f8262d : enumC0842b, (i12 & 2) != 0 ? EnumC0842b.f8262d : enumC0842b2, (i12 & 4) != 0 ? "" : str, (i12 & 8) != 0 ? "" : str2, (i12 & 16) != 0 ? "" : str3, (i12 & 32) != 0 ? 0 : i, (i12 & 64) != 0 ? 0 : i4, (i12 & 128) != 0 ? 0 : i6, (i12 & 256) != 0 ? "" : str4, (i12 & 512) != 0 ? C1112C.f9377a : list, (i12 & 1024) != 0 ? 0 : i10, (i12 & 2048) != 0 ? null : signal, (i12 & 4096) == 0 ? str5 : "", (i12 & 8192) != 0 ? C1112C.f9377a : list2, (i12 & 16384) != 0 ? C1112C.f9377a : list3, (i12 & 32768) != 0 ? M.e() : map, (i12 & 65536) != 0 ? M.e() : map2, (i12 & 131072) != 0 ? C1112C.f9377a : list4, (i12 & 262144) != 0 ? C1112C.f9377a : list5, (i12 & 524288) != 0 ? C1112C.f9377a : list6, (i12 & 1048576) != 0 ? 0 : i11, (i12 & 2097152) != 0 ? false : z4, (i12 & 4194304) != 0 ? null : stackHistoryBuffer, (i12 & 8388608) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m35newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tombstone(EnumC0842b arch, EnumC0842b guest_arch, String build_fingerprint, String revision, String timestamp, int i, int i4, int i6, String selinux_label, List<String> command_line, int i10, Signal signal, String abort_message, List<CrashDetail> crash_details, List<Cause> causes, Map<Integer, Thread> threads, Map<Integer, Thread> guest_threads, List<MemoryMapping> memory_mappings, List<LogBuffer> log_buffers, List<FD> open_fds, int i11, boolean z4, StackHistoryBuffer stackHistoryBuffer, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        j.g(arch, "arch");
        j.g(guest_arch, "guest_arch");
        j.g(build_fingerprint, "build_fingerprint");
        j.g(revision, "revision");
        j.g(timestamp, "timestamp");
        j.g(selinux_label, "selinux_label");
        j.g(command_line, "command_line");
        j.g(abort_message, "abort_message");
        j.g(crash_details, "crash_details");
        j.g(causes, "causes");
        j.g(threads, "threads");
        j.g(guest_threads, "guest_threads");
        j.g(memory_mappings, "memory_mappings");
        j.g(log_buffers, "log_buffers");
        j.g(open_fds, "open_fds");
        j.g(unknownFields, "unknownFields");
        this.arch = arch;
        this.guest_arch = guest_arch;
        this.build_fingerprint = build_fingerprint;
        this.revision = revision;
        this.timestamp = timestamp;
        this.pid = i;
        this.tid = i4;
        this.uid = i6;
        this.selinux_label = selinux_label;
        this.process_uptime = i10;
        this.signal_info = signal;
        this.abort_message = abort_message;
        this.page_size = i11;
        this.has_been_16kb_mode = z4;
        this.stack_history_buffer = stackHistoryBuffer;
        this.command_line = Internal.immutableCopyOf("command_line", command_line);
        this.crash_details = Internal.immutableCopyOf("crash_details", crash_details);
        this.causes = Internal.immutableCopyOf("causes", causes);
        this.threads = Internal.immutableCopyOf("threads", threads);
        this.guest_threads = Internal.immutableCopyOf("guest_threads", guest_threads);
        this.memory_mappings = Internal.immutableCopyOf("memory_mappings", memory_mappings);
        this.log_buffers = Internal.immutableCopyOf("log_buffers", log_buffers);
        this.open_fds = Internal.immutableCopyOf("open_fds", open_fds);
    }
}
