# SimpleShop

Jednoduchy shop plugin pro Paper/Spigot 1.20 ovladany cedulemi, s Vault ekonomikou.

## Novinka
V shop GUI (kliknuti na ceduli otevre okno s itemem):
- **Levy klik** - koupe / prodej 1 ks (shift = cela stacka), stejne jako drive.
- **Pravy klik na shulker box** - otevre nahled obsahu shulkeru (jen na podivanou, nic se nekupuje ani nelze nic vzit).

## Jak zkompilovat

### Varianta A - GitHub Actions (automaticky)
1. Tenhle cely zip nahraj/pushni do sveho GitHub repozitare (kompletni obsah teto slozky do korene repa).
2. GitHub Actions (`.github/workflows/build.yml`) se spusti automaticky pri kazdem pushnuti.
3. V zalozce **Actions** u posledniho behu najdes v sekci **Artifacts** soubor `SimpleShop-jar` - stahni si ho (je to zip s `SimpleShop.jar` uvnitr).

### Varianta B - lokalne
Je potreba mit nainstalovany JDK 17+ a Maven. Ve slozce s `pom.xml` spust:
```
mvn package
```
Hotovy plugin bude v `target/SimpleShop.jar`.

## Instalace na server
Vysledny `SimpleShop.jar` nahraj do slozky `plugins/` na Paper/Spigot serveru (1.20.x) a restartuj server.
Vyzaduje Vault + nejaky ekonomicky plugin (napr. EssentialsX).
