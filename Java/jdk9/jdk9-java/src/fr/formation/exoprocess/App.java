package fr.formation.exoprocess;

import java.lang.ProcessHandle.Info;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) {
        ProcessHandle.allProcesses().forEach(p -> {
            Info info = p.info();
            String command = info.command().orElse("- Inconnue -");
            Instant start = info.startInstant().orElse(Instant.now());
            LocalDateTime startDateTime = LocalDateTime.ofInstant(start, ZoneId.systemDefault());
            String startStr = startDateTime.format(DateTimeFormatter.ofPattern("HH:mm:ss"));

            System.out.println(command + " - " + startStr);
        });

        // Tuer Chrome
        ProcessHandle.allProcesses().forEach(p -> {
            Info info = p.info();
            String command = info.command().orElse("- Inconnue -");

            if (command.contains("chrome.exe")) {
                p.destroy();
            }
        });
    }
}
