package com.project.dreamteam.config;

import com.project.dreamteam.model.*;
import com.project.dreamteam.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = UserRepository.class)
@Configuration
public class MongoConfig {
    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository, InterestRepository interestRepository, WishRepository wishRepository, CategoryRepository categoryRepository, CourseRepository courseRepository) {
        return strings -> {

//Filling the database with some data
            userRepository.save(new User(1, "Calvin", "Ryan", "cryan"));
            userRepository.save(new User(2, "Stijn", "Olthof", "breid"));

            interestRepository.save(new Interest(1, "Ik zou graag meer willen leren over ChatGTP", "Java","cryan"));
            interestRepository.save(new Interest(2, "Ik zou graag meer willen leren over Java", "Java","solthof"));
            interestRepository.save(new Interest(3, "Ik zou graag meer willen leren over Go", "Go","solthof"));
            interestRepository.save(new Interest(4, "Ik wil uitgebreiden informatie over Dev ops en wat de Agile Value Center doet", "Werkmethode","solthof"));

            wishRepository.save(new Wish(1, "Ik zou graag een opdracht willen doen bij een internationaal bedrijf", "solthof"));
            wishRepository.save(new Wish(2, "Ik zou graag een opdracht willen doen bij een klein bedrijf", "solthof"));

            categoryRepository.save(new Category(1, "Java"));
            categoryRepository.save(new Category(2, "Go"));
            categoryRepository.save(new Category(3, "PHP"));
            categoryRepository.save(new Category(4, "Werkmethode"));

            courseRepository.save(new Course(1, "SAFe DevOps","Werkmethode", "Deze cursus biedt je een introductie in SAFe DevOps, gebaseerd op de CALMR (Culture, Automation, Lean, Measure, Recover) benadering van DevOps in het Scaled Agile Framework.", "Online", "2 days"));
            courseRepository.save(new Course(2, "Hoe werk je samen met remote Teams", "Werkmethode", "Nederlandse cursusdoelgroep: NL SOGETI Q12020. Steeds vaker worden we in ons dagelijkse werk geconfronteerd met teams die in het buitenland werken. Dit gebeurt vaak bij projecten, maar ook in bijvoorbeeld omgevingen voor applicatie-uitbesteding. Deze training biedt je een aantal praktische best practices om effectief samen te werken met externe teams. Onderwerpen die aan bod komen zijn onder andere: Hoe voorkom je miscommunicatie? Hoe optimaliseer je het gebruik van verschillen in tijdzones? Welke (communicatie)tools zijn er en hoe gebruik je deze het beste? Doelgroep: Teamleden van projecten, projectmanagers, consultants voor applicatieonderhoud. Als je geen Nederlands spreekt, informeer dan de trainer van tevoren, zodat zij de cursus in het Engels kunnen voorbereiden.", "Online", "3 uur"));
            courseRepository.save(new Course(3, "Waarde leveren met Scrum", "Werkmethode", "NL Course Audience; NL SOGETI Q12020. Scrum, overal hoor je het tegenwoordig! Trainingen zijn er in alle smaken, maar vaak alleen de theorie. In deze training ga je Scrum ervaren. Hoe is het om deel te zijn van een Scrum team? Hoe is het om te werken voor een Product Owner die elke sprint een bruikbare oplevering verwacht?Ken je de Scrum Guide maar de praktijk nog niet, of minder dan je zou willen? Dan is deze training voor jou! Door samen te werken in teams in een simulatie met Lego ervaar je de dynamiek van een echt Scrum team.DoelstellingenTijdens deze training doet de deelnemer ervaring op in:Sprint voor sprint leveren van maximale waarde voor de opdrachtgever.Het werken in een Scrum team met de tijdsdruk van een timebox (sprints)WerkvormDe training word in een simulatie-opzet gegeven, in groepsverband.Target Audience: De training is interessant voor iedereen die in een Scrum team wil werken. De focus is op groepsdynamiek en het leveren van waarde met het Scrum proces. Deze training is voor zowel beginnende als gevorderde Scrum team leden interessant en bovenal ook fun!De training is bij uitstek geschikt voor teams. Wil je deelnemen met je ontwikkelteam, vakgroep, of andere groep collega’s, neem dan contact met ons op. Wie weet kunnen we een extra editie inplannen.IngangsniveauJe hebt het meest aan de training wanneer je al met de theorie bekend bent, bijvoorbeeld via Advantage You – Agile, getting acquainted, of de Scrum Kickstart.Units (hours for course): 1 eveningStart and End Times for Each Day: 18:30 – 21:30Min/Max Attendance: Min. 9, Max. 15If you are non-Dutch speaking, please inform the trainer beforehand. So they can prepare the course in English", "Online", "3 uur"));
            courseRepository.save(new Course(4, "Java Programming Masterclass", "Java", "Leer Java in deze cursus en word een computerprogrammeur. Verkrijg waardevolle kernvaardigheden in Java en behaal een Java-certificering.", "Online Udemy", "7 dagen"));
            courseRepository.save(new Course(5, "Go programming", "Go", "Go is een open-source programmeertaal die bekend staat om zijn eenvoud, efficiëntie en concurrentievermogen. Het is ontwikkeld door Google en wordt veel gebruikt voor het bouwen van betrouwbare en schaalbare softwaretoepassingen. Go legt de nadruk op leesbaarheid, eenvoudige syntaxis en snelle uitvoering, waardoor het een favoriete keuze is voor zowel beginners als ervaren programmeurs. Het biedt ondersteuning voor gelijktijdigheid en heeft ingebouwde functionaliteiten voor het efficiënt omgaan met parallelle taken. Met Go kun je webapplicaties, API's, netwerkprotocollen en meer ontwikkelen. Het is een taal die steeds populairder wordt en wordt gebruikt door een groeiende gemeenschap van ontwikkelaars over de hele wereld.", "Op kantoor", "2 dagen"));
            courseRepository.save(new Course(6, "Go verdiept", "Go", "Een vervolg op Go programming", "Kantoor", "2 dagen"));
            courseRepository.save(new Course(7, "Java objecten", "Java", "Java verdieping op objecten", "Online", "3 uur"));
            courseRepository.save(new Course(8, "PHP objecten", "PHP", "PHP verdieping op objecten", "Online", "3 uur"));
        };
    }
}
