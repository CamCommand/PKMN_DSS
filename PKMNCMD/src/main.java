import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.util.Random;
import java.util.Scanner;

//PIT

public class main {

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner kb = new Scanner(System.in);
        System.out.println("Hello, my name is Pokémon Information Terminal. You can call me PIT. I'm a decision support system that will find you your favorite Pokémon.\n"
                + "Pokémon, are special animals that inhabited their own world, full of legends, tales, and adventures. \n"
                + "Several interpretations of the world explore different themes and elements. Most commonly, Pokémon coexist with humans and can be caught, trained, and used in battles and other activities.\n"
                + "Trainers, along with their Pokémon, travel across diverse lands aiming to make their dreams become reality.\n"
                + "I'll walk you through my questions to help me find your partner.\n"
                + "You can quit this system at any time by entering 'quit'. If you entered something and nothing appeared, just try again. I'm case sensitive. Otherwise follow the on-screen directions (case sensitive). Are you ready?\n"
                + "'yes', 'no'");
        String cmd = kb.nextLine();
        if (cmd.equals("no")) {
            System.out.println("Fine, do it yourself.");
            Thread.sleep(3000);
            Desktop d = Desktop.getDesktop();
            d.browse(URI.create("https://randompokemongenerator.com/app/#/"));
            System.exit(0);
        } else {
            while (!cmd.equals("quit")) {
                System.out.println("Great! Lets get started. Why don't we start simple, do you prefer cats or dogs?\n"
                        + "'cats', 'dogs', 'other'");
                while (!cmd.equals("quit")) {
                    cmd = kb.nextLine();
                    if (cmd.equals("cats")) {
                        System.out.println("\nAre you a relaxed person\n"
                                + "'yes', 'no'");
                        while (!cmd.equals("quit")) {
                            cmd = kb.nextLine();
                            if (cmd.equals("yes")) {
                                System.out.println("Would you say you just are a cat person?\n"
                                        + "'yes', 'no'");
                                while (!cmd.equals("quit")) {
                                    cmd = kb.nextLine();
                                    if (cmd.equals("yes")) {
                                        System.out.println("What size cats do you like?\n"
                                                + "'small', 'large'");
                                        while (!cmd.equals("quit")) {
                                            cmd = kb.nextLine();
                                            if (cmd.equals("small")) {
                                                Random r = new Random();
                                                int x = r.nextInt(6);
                                                System.out.println("Calculating...");
                                                Thread.sleep(3000);
                                                System.out.println("Great, that makes this easy.");
                                                Desktop d = Desktop.getDesktop();
                                                switch (x) {
                                                    case 0:
                                                        System.out.println("Skitty is super adorable, I hope you love them as much as I do.");
                                                        Thread.sleep(4500);
                                                        d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Skitty_(Pok%C3%A9mon)"));
                                                        break;
                                                    case 1:
                                                        System.out.println("Litten is a hot furball, but it's really calm.");
                                                        Thread.sleep(4500);
                                                        d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Litten_(Pok%C3%A9mon)"));
                                                        break;
                                                    case 2:
                                                        System.out.println("Don't let Espurr scare you, they're like little cat people, super cute.");
                                                        Thread.sleep(4500);
                                                        d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Espurr_(Pok%C3%A9mon)"));
                                                        break;
                                                    case 3:
                                                        System.out.println("Mew is a mythical Pokemon, but also like cat Lucy. You can't go wrong with Mew.");
                                                        Thread.sleep(4500);
                                                        d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Mew_(Pok%C3%A9mon)"));
                                                        break;
                                                    case 4:
                                                        System.out.println("Purrloin can be a prankster, but you can't more meow for your dollar then them.");
                                                        Thread.sleep(4500);
                                                        d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Purrloin_(Pok%C3%A9mon)"));
                                                        break;
                                                    case 5:
                                                        System.out.println("Meowths will bring you great riches, lucky you.");
                                                        Thread.sleep(4500);
                                                        d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Meowth_(Pok%C3%A9mon)"));
                                                        break;
                                                    case 6:
                                                        System.out.println("Glameow is a cat's cat. One of the best tails of all the cat Pokemon.");
                                                        Thread.sleep(4500);
                                                        d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Glameow_(Pok%C3%A9mon)"));
                                                        break;

                                                }
                                                System.exit(0);
                                            } else if (cmd.equals("large")) {
                                                Random r = new Random();
                                                int x = r.nextInt(6);
                                                System.out.println("Calculating...");
                                                Thread.sleep(3000);
                                                System.out.println("Great, that makes this easy.");
                                                Desktop d = Desktop.getDesktop();
                                                switch (x) {
                                                    case 0:
                                                        System.out.println("Persian is a lovable lap cat that will always be by your side.");
                                                        Thread.sleep(4500);
                                                        d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Persian"));
                                                        break;
                                                    case 1:
                                                        System.out.println("Delcatty loves a fashionable master.");
                                                        Thread.sleep(4500);
                                                        d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Delcatty_(Pok%C3%A9mon)"));
                                                        break;
                                                    case 2:
                                                        System.out.println("Luxray are the guard dogs of cats and will protect your person.");
                                                        Thread.sleep(4500);
                                                        d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Luxray_(Pok%C3%A9mon)"));
                                                        break;
                                                    case 3:
                                                        System.out.println("Purugly don't look like much, but they are a good sign of wealth.");
                                                        Thread.sleep(4500);
                                                        d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Purugly_(Pok%C3%A9mon)"));
                                                        break;
                                                    case 4:
                                                        System.out.println("Liepard are self-sufficient with powerful claws. Perfect alley cats. ");
                                                        Thread.sleep(4500);
                                                        d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Liepard_(Pok%C3%A9mon)"));
                                                        break;
                                                    case 5:
                                                        System.out.println("Sylveon is a child's best-friend with glowing personalities.");
                                                        Thread.sleep(4500);
                                                        d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Sylveon_(Pok%C3%A9mon)"));
                                                        break;
                                                    case 6:
                                                        System.out.println("You'll more likely be chilling on your couch with Incineroar than petting them.");
                                                        Thread.sleep(4500);
                                                        d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Incineroar_(Pok%C3%A9mon)"));
                                                        break;
                                                }
                                                System.exit(0);
                                            }
                                        }
                                    } else if (cmd.equals("no")) {
                                        System.out.println("Do you like cute animals?\n"
                                                + "'yes', 'no'");
                                        while (!cmd.equals("quit")) {
                                            cmd = kb.nextLine();
                                            if (cmd.equals("yes")) {
                                                Random r = new Random();
                                                int x = r.nextInt(5);
                                                System.out.println("Calculating...");
                                                Thread.sleep(3000);
                                                System.out.println("This Pokemon will fit you.");
                                                Desktop d = Desktop.getDesktop();
                                                switch (x) {
                                                    case 0:
                                                        System.out.println("Cyndaquil is an adorable fire Pokemon, enjoy them.");
                                                        Thread.sleep(4500);
                                                        d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Cyndaquil_(Pok%C3%A9mon)"));
                                                        break;
                                                    case 1:
                                                        System.out.println("Sandshrew is the best little sandy boy, you are welcome.");
                                                        Thread.sleep(4500);
                                                        d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Sandshrew_(Pok%C3%A9mon)"));
                                                        break;
                                                    case 2:
                                                        System.out.println("Shinx is a sparky little guy. Love them all you can.");
                                                        Thread.sleep(4500);
                                                        d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Shinx_(Pok%C3%A9mon)"));
                                                        break;
                                                    case 3:
                                                        System.out.println("Teddiursa is top tier cute.");
                                                        Thread.sleep(4500);
                                                        d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Teddiursa_(Pok%C3%A9mon)"));
                                                        break;
                                                    case 4:
                                                        System.out.println("Welcome to the God level of Swinub love!");
                                                        Thread.sleep(4500);
                                                        d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Swinub_(Pok%C3%A9mon)"));
                                                        break;
                                                }
                                                System.exit(0);
                                            } else if (cmd.equals("no")) {
                                                Random r = new Random();
                                                int x = r.nextInt(4);
                                                System.out.println("Calculating...");
                                                Thread.sleep(3000);
                                                System.out.println("This Pokemon will fit you.");
                                                Desktop d = Desktop.getDesktop();
                                                switch (x) {
                                                    case 0:
                                                        System.out.println("Zoroark is the tricksters trickster; don't get too confused they're dope.");
                                                        Thread.sleep(4500);
                                                        d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Zoroark_(Pok%C3%A9mon)"));
                                                        break;
                                                    case 1:
                                                        System.out.println("Incineroar is the boast for the most, try to keep up.");
                                                        Thread.sleep(4500);
                                                        d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Incineroar_(Pok%C3%A9mon)"));
                                                        break;
                                                    case 2:
                                                        System.out.println("You have been chosen for the Zangoose side of the never ending war.");
                                                        Thread.sleep(4500);
                                                        d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Zangoose_(Pok%C3%A9mon)"));
                                                        break;
                                                    case 3:
                                                        System.out.println("The circumstances of ones choice is irrelevant, Mewtwo has been chosen.");
                                                        Thread.sleep(4500);
                                                        d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Mewtwo_(Pok%C3%A9mon)"));
                                                        break;
                                                }
                                                System.exit(0);
                                            }
                                        }
                                    }
                                }
                            } else if (cmd.equals("no")) {
                                System.out.println("\nDo animals help you relax?\n"
                                        + "'yes', 'no'");
                                while (!cmd.equals("quit")) {
                                    cmd = kb.nextLine();
                                    if (cmd.equals("yes")) {
                                        Random r = new Random();
                                        int x = r.nextInt(4);
                                        System.out.println("Calculating...");
                                        Thread.sleep(3000);
                                        System.out.println("This Pokemon will fit you.");
                                        Desktop d = Desktop.getDesktop();
                                        switch (x) {
                                            case 0:
                                                System.out.println("Snorlax is just a cat bed. What else do you want?");
                                                Thread.sleep(4500);
                                                d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Snorlax_(Pok%C3%A9mon)"));
                                                break;
                                            case 1:
                                                System.out.println("Cinccino is the fluffiest little bugger you'll ever need.");
                                                Thread.sleep(4500);
                                                d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Cinccino_(Pok%C3%A9mon)"));
                                                break;
                                            case 2:
                                                System.out.println("Hate to say to go with the basic but, you'd enjoy a Pikachu.");
                                                Thread.sleep(4500);
                                                d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Pikachu"));
                                                break;
                                            case 3:
                                                System.out.println("Meowstic's are nice and you can have two of them.");
                                                Thread.sleep(4500);
                                                d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Meowstic_(Pok%C3%A9mon)"));
                                                break;
                                        }
                                        System.exit(0);
                                    } else if (cmd.equals("no")) {
                                        Random r = new Random();
                                        int x = r.nextInt(4);
                                        System.out.println("Calculating...");
                                        Thread.sleep(3000);
                                        System.out.println("This Pokemon will fit you.");
                                        Desktop d = Desktop.getDesktop();
                                        switch (x) {
                                            case 0:
                                                System.out.println("Gardevoir is a majestic beauty and must be treated as such.");
                                                Thread.sleep(4500);
                                                d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Gardevoir_(Pok%C3%A9mon)"));
                                                break;
                                            case 1:
                                                System.out.println("Machamp is the Pokemon to chill on the couch with.");
                                                Thread.sleep(4500);
                                                d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Machamp_(Pok%C3%A9mon)"));
                                                break;
                                            case 2:
                                                System.out.println("Mienshao is the cat to slap back and be your bestfriend.");
                                                Thread.sleep(4500);
                                                d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Mienshao_(Pok%C3%A9mon)"));
                                                break;
                                            case 3:
                                                System.out.println("Congratulation, you are now part of a rare breed of Mr. Mime fans.");
                                                Thread.sleep(4500);
                                                d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Mr._Mime_(Pok%C3%A9mon)"));
                                                break;
                                        }
                                        System.exit(0);
                                    }
                                }
                            }
                        }
                    } else if (cmd.equals("dogs")) {
                        System.out.println("\nAre you a extroverted person?\n"
                                + "'yes', 'no'");
                        while (!cmd.equals("quit")) {
                            cmd = kb.nextLine();
                            if (cmd.equals("yes")) {
                                System.out.println("Do you like things that look awesome?\n" +
                                        "'yes' or 'no'");
                                while (!cmd.equals("quit")) {
                                    cmd = kb.nextLine();
                                    if (cmd.equals("yes")) {
                                        Random r = new Random();
                                        int x = r.nextInt(5);
                                        System.out.println("Calculating...");
                                        Thread.sleep(3000);
                                        System.out.println("Then I think you'll like this Pokemon.");
                                        Desktop d = Desktop.getDesktop();
                                        switch (x) {
                                            case 0:
                                                System.out.println("Arcanine is a dope fire dog, nuff said.");
                                                Thread.sleep(4500);
                                                d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Arcanine_(Pok%C3%A9mon)"));
                                                break;
                                            case 1:
                                                System.out.println("Furfrou is a fluffy side dog that can be styled into whatever way you want.");
                                                Thread.sleep(4500);
                                                d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Furfrou_(Pok%C3%A9mon)"));
                                                break;
                                            case 2:
                                                System.out.println("Stoutland ix a huge lad, their lineage can be tracked back to royalty.");
                                                Thread.sleep(4500);
                                                d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Stoutland_(Pok%C3%A9mon)"));
                                                break;
                                            case 3:
                                                System.out.println("Lycanroc changes based on what time of day it evolved, pick your favorite.");
                                                Thread.sleep(4500);
                                                d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Lycanroc_(Pok%C3%A9mon)"));
                                                break;
                                            case 4:
                                                System.out.println("Granbull is the guard dog of your dreams.");
                                                Thread.sleep(4500);
                                                d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Granbull_(Pok%C3%A9mon)"));
                                                break;
                                            case 5:
                                                System.out.println("Mightyena can be aggressive, but they're just like cuter hunters.");
                                                Thread.sleep(4500);
                                                d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Mightyena_(Pok%C3%A9mon)"));
                                                break;
                                        }
                                        System.exit(0);
                                    } else if (cmd.equals("no")) {
                                        Random r = new Random();
                                        int x = r.nextInt(5);
                                        System.out.println("Calculating...");
                                        Thread.sleep(3000);
                                        System.out.println("Then I think you'll like this Pokemon.");
                                        Desktop d = Desktop.getDesktop();
                                        switch (x) {
                                            case 0:
                                                System.out.println("Everyone loves Mudkip.");
                                                Thread.sleep(4500);
                                                d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Mudkip_(Pok%C3%A9mon)"));
                                                break;
                                            case 1:
                                                System.out.println("Umbreon isn't as emo has they look, give them a try.");
                                                Thread.sleep(4500);
                                                d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Umbreon_(Pok%C3%A9mon)"));
                                                break;
                                            case 2:
                                                System.out.println("Anyone can love Vulpix, they come in spicy and freeze.");
                                                Thread.sleep(4500);
                                                d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Vulpix_(Pok%C3%A9mon)"));
                                                break;
                                            case 3:
                                                System.out.println("Bulbasaur is a classic, first and only of it's kind to have a Poison typing.");
                                                Thread.sleep(4500);
                                                d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Bulbasaur_(Pok%C3%A9mon)"));
                                                break;
                                            case 4:
                                                System.out.println("Manectric will find you in any shocking situation.");
                                                Thread.sleep(4500);
                                                d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Manectric_(Pok%C3%A9mon)"));
                                                break;
                                            case 5:
                                                System.out.println("Riolu has a lot of 'art' online, I'm sure it will only enhance your love for them.");
                                                Thread.sleep(4500);
                                                d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Riolu_(Pok%C3%A9mon)"));
                                                break;
                                        }
                                        System.exit(0);
                                    }
                                }
                            } else if (cmd.equals("no")) {
                                System.out.println("\nWould you say you're pretty chill?\n"
                                        + "'yes', 'no'");
                                while (!cmd.equals("quit")) {
                                    cmd = kb.nextLine();
                                    if (cmd.equals("yes")) {
                                        Random r = new Random();
                                        int x = r.nextInt(5);
                                        System.out.println("Calculating...");
                                        Thread.sleep(3000);
                                        System.out.println("Then I think you'll like this Pokemon then.");
                                        Desktop d = Desktop.getDesktop();
                                        switch (x) {
                                            case 0:
                                                System.out.println("Absol's warn you against incoming danger.");
                                                Thread.sleep(4500);
                                                d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Absol_(Pok%C3%A9mon)"));
                                                break;
                                            case 1:
                                                System.out.println("Metagross are like computer dogs, they just wanna sit by you.");
                                                Thread.sleep(4500);
                                                d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Metagross_(Pok%C3%A9mon)"));
                                                break;
                                            case 2:
                                                System.out.println("Silvally can be whatever you want them to be; cold or warm; calm or hyper.");
                                                Thread.sleep(4500);
                                                d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Silvally_(Pok%C3%A9mon)"));
                                                break;
                                            case 3:
                                                System.out.println("Slowpokes can only go at once pace, please be patient.");
                                                Thread.sleep(4500);
                                                d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Slowpoke_(Pok%C3%A9mon)"));
                                                break;
                                            case 4:
                                                System.out.println("Espeon are psychic and flawless.");
                                                Thread.sleep(4500);
                                                d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Espeon_(Pok%C3%A9mon)"));
                                                break;
                                            case 5:
                                                System.out.println("If you're that chill, you'll like Glaceon.");
                                                Thread.sleep(4500);
                                                d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Glaceon_(Pok%C3%A9mon)"));
                                                break;
                                        }
                                        System.exit(0);
                                    } else if (cmd.equals("no")) {
                                        Random r = new Random();
                                        int x = r.nextInt(5);
                                        System.out.println("Calculating...");
                                        Thread.sleep(3000);
                                        System.out.println("Then I think you'll like this Pokemon then.");
                                        Desktop d = Desktop.getDesktop();
                                        switch (x) {
                                            case 0:
                                                System.out.println("Lillipup is the dog for you!");
                                                Thread.sleep(4500);
                                                d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Lillipup_(Pok%C3%A9mon)"));
                                                break;
                                            case 1:
                                                System.out.println("Poochyena is a little wild, but super good if you love them enough.");
                                                Thread.sleep(4500);
                                                d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Poochyena_(Pok%C3%A9mon)"));
                                                break;
                                            case 2:
                                                System.out.println("Eevee can be whatever you want them to be, but let Eevee be themselves.");
                                                Thread.sleep(4500);
                                                d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Eevee_(Pok%C3%A9mon)"));
                                                break;
                                            case 3:
                                                System.out.println("Electrike is a fast one, be sure you can keep track of them.");
                                                Thread.sleep(4500);
                                                d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Electrike_(Pok%C3%A9mon)"));
                                                break;
                                            case 4:
                                                System.out.println("Houndour can be a little rough and tough, but deep down they just need a home.");
                                                Thread.sleep(4500);
                                                d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Houndour_(Pok%C3%A9mon)"));
                                                break;
                                            case 5:
                                                System.out.println("Rockruff is the peek of puppy power.");
                                                Thread.sleep(4500);
                                                d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Rockruff_(Pok%C3%A9mon)"));
                                                break;
                                        }
                                        System.exit(0);
                                    }
                                }
                            }
                        }
                    } else if (cmd.equals("other")) {
                        System.out.println("\nWould you say your tastes are legendary?\n"
                                + "'yes', 'no'");
                        while (!cmd.equals("quit")) {
                            cmd = kb.nextLine();
                            if (cmd.equals("yes")) {
                                Random r = new Random();
                                int x = r.nextInt(8);
                                System.out.println("Calculating...");
                                Thread.sleep(3000);
                                System.out.println("You sure are full of yourself.");
                                Desktop d = Desktop.getDesktop();
                                switch (x) {
                                    case 0:
                                        System.out.println("Entei kinda sucks in batlle, but damn he looks cool.");
                                        Thread.sleep(4500);
                                        d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Entei_(Pok%C3%A9mon)"));
                                        break;
                                    case 1:
                                        System.out.println("Suicune has blown its way into your heart.");
                                        Thread.sleep(4500);
                                        d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Suicune_(Pok%C3%A9mon)"));
                                        break;
                                    case 2:
                                        System.out.println("Lugia is the water, bird, psychic, finger having thing of your dreams.");
                                        Thread.sleep(4500);
                                        d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Lugia_(Pok%C3%A9mon)"));
                                        break;
                                    case 3:
                                        System.out.println("Arceus is God. Mortals will bow to your divine taste.");
                                        Thread.sleep(4500);
                                        d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Arceus_(Pok%C3%A9mon)"));
                                        break;
                                    case 4:
                                        System.out.println("Groudon shaped the earth, now he shapes our hearts.");
                                        Thread.sleep(4500);
                                        d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Groudon_(Pok%C3%A9mon)"));
                                        break;
                                    case 5:
                                        System.out.println("Kyogre is the Sea King, not to be confused with Seaking.");
                                        Thread.sleep(4500);
                                        d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Kyogre_(Pok%C3%A9mon)"));
                                        break;
                                    case 6:
                                        System.out.println("Rayquaza is the master of Mega Evolution. If you haven't played Pokemon in a while then hold onto something.");
                                        Thread.sleep(4500);
                                        d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Rayquaza_(Pok%C3%A9mon)"));
                                        break;
                                    case 7:
                                        System.out.println("Giratina is the devil of Pokemon, but instead of defying an all powerful being it was just too damn violent.");
                                        Thread.sleep(4500);
                                        d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Giratina_(Pok%C3%A9mon)"));
                                        break;
                                }
                                System.exit(0);
                            } else if (cmd.equals("no")) {
                                System.out.println("\nSo where does your favorite animal fall?\n"
                                        + "'bug', 'fish', 'amphibian', 'bird', 'plant', 'rock'");
                                while (!cmd.equals("quit")) {
                                    cmd = kb.nextLine();
                                    String group;
                                    if (cmd.equals("bug")) {
                                        group = "bug";
                                        Random r = new Random();
                                        System.out.println("Calculating...");
                                        Thread.sleep(3000);
                                        int x = r.nextInt(4);
                                        System.out.println("OK, I got it, enjoy your " + group + ".");
                                        Desktop d = Desktop.getDesktop();
                                        switch (x) {
                                            case 0:
                                                System.out.println("Buzz buzz, it's Beedrill!");
                                                Thread.sleep(4500);
                                                d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Beedrill_(Pok%C3%A9mon)"));
                                                break;
                                            case 1:
                                                System.out.println("Heracross is a giant beetle with a cute face.");
                                                Thread.sleep(4500);
                                                d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Heracross_(Pok%C3%A9mon)"));
                                                break;
                                            case 2:
                                                System.out.println("Volcarona is an arbiter for the sun, shine on.");
                                                Thread.sleep(4500);
                                                d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Volcarona_(Pok%C3%A9mon)"));
                                                break;
                                            case 3:
                                                System.out.println("Shuckle squad. Shuckle squad. Shuckle squad. Shuckle squad. Ah yeah!");
                                                Thread.sleep(4500);
                                                d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Shuckle_(Pok%C3%A9mon)"));
                                                break;
                                        }
                                        System.exit(0);
                                    } else if (cmd.equals("fish")) {
                                        group = "fish";
                                        Random r = new Random();
                                        int x = r.nextInt(4);
                                        System.out.println("Calculating...");
                                        Thread.sleep(3000);
                                        System.out.println("OK, I got it, enjoy your " + group + ".");
                                        Desktop d = Desktop.getDesktop();
                                        switch (x) {
                                            case 0:
                                                System.out.println("Welcome to Qwilfish, I'm glad I could be the one to lead you here.");
                                                Thread.sleep(4500);
                                                d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Qwilfish_(Pok%C3%A9mon)"));
                                                break;
                                            case 1:
                                                System.out.println("If anyone tells you Magikarp is basic, look'em dead in the eyes and splash around.");
                                                Thread.sleep(4500);
                                                d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Magikarp_(Pok%C3%A9mon)"));
                                                break;
                                            case 2:
                                                System.out.println("Mantine is the ray of your dreams.");
                                                Thread.sleep(4500);
                                                d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Mantine_(Pok%C3%A9mon)"));
                                                break;
                                            case 3:
                                                System.out.println("Sharpedo is a shark torpedo, what else could you ask for?");
                                                Thread.sleep(4500);
                                                d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Sharpedo_(Pok%C3%A9mon)"));
                                                break;
                                        }
                                        System.exit(0);
                                    } else if (cmd.equals("amphibian")) {
                                        group = "amphibian";
                                        Random r = new Random();
                                        int x = r.nextInt(4);
                                        System.out.println("Calculating...");
                                        Thread.sleep(3000);
                                        System.out.println("OK, I got it, enjoy your " + group + ".");
                                        Desktop d = Desktop.getDesktop();
                                        switch (x) {
                                            case 0:
                                                System.out.println("Froakie is an awesome little bubble frog. There are lots of frogs to have but they float above the rest.");
                                                Thread.sleep(4500);
                                                d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Froakie_(Pok%C3%A9mon)"));
                                                break;
                                            case 1:
                                                System.out.println("Swampert is a mudskipper that took it too far.");
                                                Thread.sleep(4500);
                                                d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Swampert_(Pok%C3%A9mon)"));
                                                break;
                                            case 2:
                                                System.out.println("Slowbro is no shell fish, but there no push over either.");
                                                Thread.sleep(4500);
                                                d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Slowbro_(Pok%C3%A9mon)"));
                                                break;
                                            case 3:
                                                System.out.println("Take one look at Wooper and tell me you didn't just fall in love.");
                                                Thread.sleep(4500);
                                                d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Wooper_(Pok%C3%A9mon)"));
                                                break;
                                        }
                                        System.exit(0);
                                    } else if (cmd.equals("bird")) {
                                        group = "bird";
                                        Random r = new Random();
                                        int x = r.nextInt(4);
                                        System.out.println("Calculating...");
                                        Thread.sleep(3000);
                                        System.out.println("OK, I got it, enjoy your " + group + ".");
                                        Desktop d = Desktop.getDesktop();
                                        switch (x) {
                                            case 0:
                                                System.out.println("Staraptor is the hawk to beat all hawks. Plus cool hair.");
                                                Thread.sleep(4500);
                                                d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Staraptor_(Pok%C3%A9mon)"));
                                                break;
                                            case 1:
                                                System.out.println("Now Crobat isn't a 'bird' but bats fly and they're cool, so.");
                                                Thread.sleep(4500);
                                                d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Crobat_(Pok%C3%A9mon)"));
                                                break;
                                            case 2:
                                                System.out.println("Togekiss is fluff that takes to the sky.");
                                                Thread.sleep(4500);
                                                d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Togekiss_(Pok%C3%A9mon)"));
                                                break;
                                            case 3:
                                                System.out.println("Skarmory is a metal monster");
                                                Thread.sleep(4500);
                                                d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Skarmory_(Pok%C3%A9mon)"));
                                                break;
                                        }
                                        System.exit(0);
                                    } else if (cmd.equals("plant")) {
                                        group = "plant";
                                        Random r = new Random();
                                        int x = r.nextInt(4);
                                        System.out.println("Calculating...");
                                        Thread.sleep(3000);
                                        System.out.println("OK, I got it, enjoy your " + group + ".");
                                        Desktop d = Desktop.getDesktop();
                                        switch (x) {
                                            case 0:
                                                System.out.println("Sceptile is a gecko tree and you can't tell me he isn't awesome.");
                                                Thread.sleep(4500);
                                                d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Sceptile_(Pok%C3%A9mon)"));
                                                break;
                                            case 1:
                                                System.out.println("Roserade is just one of the classiest Pokemon.");
                                                Thread.sleep(4500);
                                                d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Roserade_(Pok%C3%A9mon)"));
                                                break;
                                            case 2:
                                                System.out.println("A little abrasive but, Ferrothorn are tough as nails.");
                                                Thread.sleep(4500);
                                                d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Ferrothorn_(Pok%C3%A9mon)"));
                                                break;
                                            case 3:
                                                System.out.println("Ludicolo is not really a 'plant' plant. It is just such a joy to be around though.");
                                                Thread.sleep(4500);
                                                d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Ludicolo_(Pok%C3%A9mon)"));
                                                break;
                                        }
                                        System.exit(0);
                                    } else if (cmd.equals("rock")) {
                                        group = "rock";
                                        Random r = new Random();
                                        int x = r.nextInt(4);
                                        System.out.println("Calculating...");
                                        Thread.sleep(3000);
                                        System.out.println("OK, I got it, enjoy your " + group + ".");
                                        Desktop d = Desktop.getDesktop();
                                        switch (x) {
                                            case 0:
                                                System.out.println("If you like cutting stone well boy of boy here comes Kabutops.");
                                                Thread.sleep(4500);
                                                d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Kabutops_(Pok%C3%A9mon)"));
                                                break;
                                            case 1:
                                                System.out.println("Tyranitar is a monster of a Pokemon. You'll be happy with this.");
                                                Thread.sleep(4500);
                                                d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Tyranitar_(Pok%C3%A9mon))"));
                                                break;
                                            case 2:
                                                System.out.println("Carbink is a tight little bugger, cute as a button though.");
                                                Thread.sleep(4500);
                                                d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Carbink_(Pok%C3%A9mon)"));
                                                break;
                                            case 3:
                                                System.out.println("Corsola is a beautiful coral queen.");
                                                Thread.sleep(4500);
                                                d.browse(URI.create("https://bulbapedia.bulbagarden.net/wiki/Corsola_(Pok%C3%A9mon)"));
                                                break;
                                        }
                                        System.exit(0);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("If you reach here I've been broken. Beep Boop go do something else.");
    }
}


