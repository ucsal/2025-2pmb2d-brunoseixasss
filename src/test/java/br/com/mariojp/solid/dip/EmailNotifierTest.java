package br.com.mariojp.solid.dip;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmailNotifierTest {
    @Test
    void dry_run_should_not_touch_smtp() {
        var notifier = new EmailNotifier(new DryRunMailSender());
        assertDoesNotThrow(() -> notifier.welcome(new User("Ana", "ana@example.com")),
                "Após refatoração (DIP), DRY_RUN deve evitar SMTP real");
    }
}