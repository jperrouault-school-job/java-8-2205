import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

ProcessHandle.allProcesses().forEach(p -> {
    ProcessHandle.Info procInfo = p.info();
    Instant instant = procInfo.startInstant().orElse(Instant.now());
    LocalDateTime date = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
    String time = date.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    String command = procInfo.command().orElse("- Inconnue -");

    System.out.println(command + " - " + time);
});