------------------------------
For Texture and JSON Authors
------------------------------

All files should be added to folders under

src/main/resources/assets/mntchkn

Which will be abbreviated as assets.mntchkn

------------------------------

For adding Item Textures:

	1) Use .png only
	2) Picture size (in pixels) must be one of the following or of a similar 8x8 ratio:
		8x8
		16x16 -- Preferred
		32x32
		64x64
		128x128
	3) Name should be:
		insertnamehere_item.png
	4) Place texture in the "assets.mntchkn.textures.item" package

For adding Block Textures:

	1) Use .png only
	2) Picture size (in pixels) must be one of the following or of a similar 8x8 ratio:
		8x8
		16x16 -- Preferred
		32x32
		64x64
		128x128 -- Might cause lag on lower end PC's
	3) Name should be:
		insertnamehere_block.png
	4) Place texture in "assets.mntchkn.textures.block" package
		
For adding JSON File for Items:

	1) Use example_item.json and as template (replace "/example_item" with "/insertnamehere_item")
	2) Place .json file in assets.mntchkn.models.item

For adding JSON File for Blocks:

	1) You will need to create two JSON files (one for the block and one for the item of the block)
	2) Use example_block_item.json and as template (replace "/example_block" with "/insertnamehere_block")
	3) Place .json file in assets.mntchkn.models.item
	4) Use example_block.json and as template (replace "/example_block" with "/insertnamehere_block")
	5) Place .json file in assets.mntchkn.models.block

For adding Language Translate

	1) Open "en_us.json" under the "assets.mntchkn.lang" package
	2) Add line for item or block based on example provided.
	
	
------------------------------
For Coding Authors
------------------------------

Use git-pull to download this repository. 
Request access to contribute by asking Cameron on Discord or through text.

After downloading, to setup your workspace and run configs follow these instructions:

	1) Open a command prompt or Power Shell window in the project folder
	2) Execute "./gradlew genEclipseRuns" or "./gradlew genIntellijRuns" if you use Intellij to create run configurations
	3) Test the project to see if it builds properly and runs
	4) Execute "./graldew --refresh-dependencies" and "./gradlew clean" to refresh and reset libraries (will not affect code)
	5) Execute "./gradlew eclipse" to rebuild the project entirely (will not affect code)
	6) You may have to do steps 4 and 5 multiple times to fix a building issue

Consult https://mcforge.readthedocs.io/en/latest/ for official forge documentation
There are also a bunch of tutorials and online help that you can find through Google.