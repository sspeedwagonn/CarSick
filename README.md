# CarSick

CarSick is a rewrite of CartSick using the VehiclesPlus API. CarSick randomly induces motion sickness when a player exists a vehicle. Very early development, but soon to hook into CiviHealth.

## Command
`/carsick` - Reloads the plugin if player has permissions `carsick.reload`

## config.yml
```yaml
chance: 5 # % chance of a player becoming carsick
time: 10 # How long carsickness should last (in seconds)
excluded-worlds: # Worlds where players should not be subject to motion sickness
  - world_nether
  - world_the_end
```