import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // Creazione finestra
        JFrame frame = new JFrame("Portfolio - Davide Albo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 500); // Frame più grande
        frame.setLocationRelativeTo(null);

        // Pannello principale
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBackground(Color.WHITE);
        panel.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30));

        // Titolo
        JLabel title = new JLabel("🌟 Portfolio Personale 🌟");
        title.setFont(new Font("SansSerif", Font.BOLD, 28));
        title.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Nome e scuola
        JLabel name = new JLabel("👤 Nome: Davide Albo");
        name.setFont(new Font("SansSerif", Font.PLAIN, 18));

        JLabel school = new JLabel("🏫 ITIS Benedetto Castelli di Brescia");
        school.setFont(new Font("SansSerif", Font.PLAIN, 18));

        // Descrizione ampliata
        JTextArea description = new JTextArea(
                "💻 Sono Davide Albo, uno studente classe 2008 appassionato di informatica.\n" +
                        "La programmazione non è solo un percorso di studio, ma anche una vera e propria passione.\n" +
                        "Mi piace affrontare nuove sfide, risolvere problemi complessi e trasformare le idee in codice.\n\n"
        );
        description.setFont(new Font("SansSerif", Font.PLAIN, 16));
        description.setEditable(false);
        description.setBackground(Color.WHITE);
        description.setLineWrap(true);
        description.setWrapStyleWord(true);

        // Competenze più dettagliate
        JTextArea skills = new JTextArea(
                "⚡ Competenze Tecniche:\n" +
                        " - Linguaggi: Java, C++\n" +
                        " - Web development: HTML, CSS, JavaScript\n" +
                        " - In apprendimento: Node.js, Express.js\n\n" +
                        "Mi piace sperimentare nuove tecnologie e migliorare costantemente le mie competenze.\n\n"
        );
        skills.setFont(new Font("SansSerif", Font.PLAIN, 16));
        skills.setEditable(false);
        skills.setBackground(Color.WHITE);
        skills.setLineWrap(true);
        skills.setWrapStyleWord(true);

        // Hobby più descrittivi
        JTextArea hobbies = new JTextArea(
                "🏋️ Hobby e Interessi:\n" +
                        " - Allenamento in palestra, una passione che coltivo da molti anni.\n" +
                        "   Mi aiuta a mantenere equilibrio, disciplina e concentrazione.\n" +
                        " - Sono curioso, motivato e sempre pronto a imparare cose nuove.\n"
        );
        hobbies.setFont(new Font("SansSerif", Font.PLAIN, 16));
        hobbies.setEditable(false);
        hobbies.setBackground(Color.WHITE);
        hobbies.setLineWrap(true);
        hobbies.setWrapStyleWord(true);

        // ScrollPane per testi lunghi (così non escono fuori dal frame)
        JScrollPane scrollPane = new JScrollPane(panel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        // Aggiunta componenti al pannello
        panel.add(title);
        panel.add(Box.createRigidArea(new Dimension(0, 20)));
        panel.add(name);
        panel.add(school);
        panel.add(Box.createRigidArea(new Dimension(0, 20)));
        panel.add(description);
        panel.add(skills);
        panel.add(hobbies);

        // Aggiunta pannello alla finestra
        frame.add(scrollPane);
        frame.setVisible(true);
    }
}
