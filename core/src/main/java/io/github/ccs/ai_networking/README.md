# AI / Networking Team

Owns computer-player behavior, matchmaking hooks, multiplayer protocol code, request/response clients, and network session state.

Keep pure chess rules in `game_logic`; this folder should decide or transport moves, not define whether a move is legal.
