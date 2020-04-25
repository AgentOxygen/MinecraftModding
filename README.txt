------------------------------
For Texture and JSON Authors
------------------------------

For adding Item Textures:

	1) Use .png only
	2) Picture size (in pixels) must be one of the following:
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
	2) Picture size (in pixels) must be one of the following:
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